package fr.naruse.spleef.common;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflections {

    public static void setNoGravity(Entity e, boolean isNoGravity) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Class<?> craftEntityClass = getCBClass();
        Method getHandle = craftEntityClass.getMethod("getHandle");
        Object craftEntity = getHandle.invoke(e);
        Method getNavigation = getNMSClass().getMethod("setNoGravity", boolean.class);
        getNavigation.invoke(craftEntity, isNoGravity);
    }

    public static void setInvisible(Entity e, boolean isInvislbe) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Class<?> craftEntityClass = getCBClass();
        Method getHandle = craftEntityClass.getMethod("getHandle");
        Object craftEntity = getHandle.invoke(e);
        Method getNavigation = getNMSClass().getMethod("setInvisible", boolean.class);
        getNavigation.invoke(craftEntity, isInvislbe);
    }

    private static Class<?> getNMSClass() throws ClassNotFoundException {
        String version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + ".";
        String name = "net.minecraft.server." + version + "EntityArmorStand";
        return Class.forName(name);
    }

    private static Class<?> getCBClass() throws ClassNotFoundException {
        String version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + ".";
        String name = "org.bukkit.craftbukkit." + version + "entity.CraftEntity";
        return Class.forName(name);
    }

    private static Object getConnection(Player player) throws SecurityException, NoSuchMethodException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Method getHandle = player.getClass().getMethod("getHandle");
        Object nmsPlayer = getHandle.invoke(player);
        Field conField = nmsPlayer.getClass().getField("playerConnection");
        return conField.get(nmsPlayer);
    }

}
