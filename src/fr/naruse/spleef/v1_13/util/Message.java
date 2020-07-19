package fr.naruse.spleef.v1_13.util;

import fr.naruse.spleef.main.SpleefPlugin;
import fr.naruse.spleef.manager.SpleefPluginV1_13;

import java.util.Objects;

public enum Message {

    SPLEEF(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleef")), Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleef")), Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleef")), "spleef"),
    NEED_A_NUMBER("Il faut un nombre.", "The plugin needs a number.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("needANumber")), "needANumber"),
    NAME_ALREADY_USED("Nom déjà utilisé.", "Name already used.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("nameAlreadyUsed")), "nameAlreadyUsed"),
    TOO_MUCH_SPLEEFS("Maximum 1000 spleefs.", "Maximum 1000 spleefs", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("tooMuchSpleefs")), "tooMuchSpleefs"),
    SPLEEF_CREATED("Spleef créé.", "Spleef created.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefCreated")), "spleefCreated"),
    SPLEEF_DELETED("Spleef supprimé.", "Spleef deleted.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefDeleted")), "spleefDeleted"),
    SPLEEF_NOT_FOUND("Spleef introuvable.", "Spleef not found.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefNotFound")), "spleefNotFound"),
    DONE("Processus terminé.", "Process completed.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("done")), "done"),
    GREATER_THAN_1("Il faut un nombre plus grand que 1.", "The plugin needs a number greater than 1.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("greaterThan1")), "greaterThan1"),
    NUMBER_SAVED("Nombre enregistré.", "Number saved.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("numberSaved")), "numberSaved"),
    LOCATION_SAVED("Location enregistrée.", "Location saved.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("locationSaved")), "locationSaved"),
    SPLEEF_OPENED("Spleef ouvert.", "Spleef opened.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefOpened")), "spleefOpened"),
    SPLEEF_CLOSED("Fermé.", "Closed.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefClosed")), "spleefClosed"),
    READY("Prêt", "Ready", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("ready")), "ready"),
    MISSING("manquants", "missing", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("missing")), "missing"),
    JOIN("Rejoignez", "Join", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("join")), "join"),
    YOU_DONT_HAVE_SPLEEF("Vous n'êtes dans aucunes parties.", "You are not in any games.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("youDoNotHaveSpleef")), "youDoNotHaveSpleef"),
    PAGE_NOT_FOUND("Page introuvable.", "Page not found.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("pageNotFound")), "pageNotFound"),
    YOU_ALREADY_IN_GAME("Vous êtes déjà dans une partie.", "You already in spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("youAlreadyInGame")), "youAlreadyInGame"),
    NOT_ENOUGH_PLAYER("Il n'y a pas assez de joueurs pour débuter la partie.", "There are not enough players to start the spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("notEnoughPlayers")), "notEnoughPlayers"),
    GAME_START("La partie commence.", "Game is starting.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("gameStarts")), "gameStarts"),
    WINS_THE_GAME("remporte la partie!", "wins this spleef!", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("winsTheGame")), "winsTheGame"),
    IN_GAME("En cours.", "In spleef", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("inGame")), "inGame"),
    FELL_INTO_THE_LAVA("est tombé(e).", "fell.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("fell")), "fell"),
    FULL_GAME("Cette partie est pleine.", "This spleef is full.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("fullGame")), "fullGame"),
    LEAVE_THIS_GAME("Quitter la partie.", "Leave the spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("leaveThisGame")), "leaveThisGame"),
    JOINED_THE_GAME("a rejoint la partie.", "joined the spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("joinedTheGame")), "joinedTheGame"),
    LEAVED_THE_GAME("a quitté la partie.", "left the spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("leftTheGame")), "leftTheGame"),
    LANG_SAVED("Language enregistré.", "Lang saved", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("langSaved")), "langSaved"),
    SPLEEF_IN_OPERATION("Les Spleefs en fonctions:", "Spleefs in operation:", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefInOperation")), "spleefInOperation"),
    SPLEEF_IN_FAILURE("Les Spleefs mal configurés:", "Spleefs in incorrectly configured:", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefInFailure")), "spleefInFailure"),
    SPLEEF_ALREADY_STARTED("Spleef déjà en cours.", "Spleef already in spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefAlreadyStarted")), "spleefAlreadyStarted"),
    SPLEEF_STOPPED("Spleef stoppé.", "Spleef stopped.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefStopped")), "spleefStopped"),
    REGION_SAVED("Region enregistrée.", "Region saved.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("regionSaved")), "regionSaved"),
    NEEDS_WE("Cette commande nécessite WorldEdit pour fonctionner.", "This command needs WorldEdit to work.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("needsWE")), "needsWE"),
    REGION_REMOVED("Région supprimée.", "Region removed.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("regionRemoved")), "regionRemoved"),
    YOU_DONT_HAVE_THIS_PERMISSION("Vous n'avez pas la permission.", "You do not have this permission.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("youDoNotHaveThisPermission")), "youDoNotHaveThisPermission"),
    WAGER("Pari", "Wager", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("wager")), "wager"),
    YOU_DO_NOT_HAVE_A_WAGER("Vous n'avez aucun pari.", "You do not have a wager.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("youDoNotHaveAWager")), "youDoNotHaveAWager"),
    PLAYER_NOT_FOUND("Joueur introuvable.", "Player not found.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("playerNotFound")), "playerNotFound"),
    WAGER_SENT("Pari envoyé.", "Wager sent.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("wagerSent")), "wagerSent"),
    THIS_PLAYER_HAS_WAGER("Un des deux joueurs possède déjà un pari.", "One of the two players already has a wager.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("thisPlayerHasWager")), "thisPlayerHasWager"),
    WAGER_ACCEPTED("Pari accepté.", "Wager accepted.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("wagerAccepted")), "wagerAccepted"),
    WAGER_DECLINED("Pari décliné.", "Wager declined.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("wagerDeclined")), "wagerDeclined"),
    WAGER_RECEIVED_BY("Invitation pour un pari reçu de", "Invitation for a wager received by", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("invitationWagerReceivedBy")), "invitationWagerReceivedBy"),
    AWAITING_VALIDATION("En attente de validation de l'autre joueur.", "Awaiting validation from the other player.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("awaitingValidation")), "awaitingValidation"),
    WAGER_ACTIVATED("Le pari a débuté.", "The wager has begun.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("wagerActivated")), "wagerActivated"),
    WON_THE_WAGER("a gagné le pari!", "won the wager!", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("wonTheWager")), "wonTheWager"),
    ONE_PLAYER_HAS_A_GAME("L'un des deux joueurs est en spleef.", "One of the two players is in the spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("onePlayerHasAGame")), "onePlayerHasAGame"),
    CANT_JOIN_WAGER_NOT_ACTIVE("Vous ne pouvez pas rejoindre une partie car votre pari n'est pas encore accepté.", "You cannot join a spleef because your bet is not yet accepted.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("cannotJoinWagerNotActive")), "cannotJoinWagerNotActive"),
    SPLEEF_GAME_MODE_NOT_FOUND("Mode de jeu introuvable.", "Game mode not found.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefGameModeNotFound")), "spleefGameModeNotFound"),
    NO_DUEL_SPLEEF_FOUND("Aucun Spleef n'a été trouvé pour ce mode de jeu.", "No Spleef has been found for this spleef mode.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("noDuelSpleefFound")), "noDuelSpleefFound"),
    ALL_DUEL_SPLEEF_IN_GAME("Tous les Spleefs pour ce mode de jeu sont en cours.", "All Spleefs for this spleef mode are in spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("allDuelSpleefInGame")), "allDuelSpleefInGame"),
    RESERVED_SPLEEF("Partie réservée.", "Reserved spleef.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("reservedSpleef")), "reservedSpleef"),
    DUEL_SENT("Duel envoyé.", "Duel sent.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("duelSent")), "duelSent"),
    DUEL_ACCEPTED("Duel accepté.", "Duel accepted.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("duelAccepted")), "duelAccepted"),
    DUEL_DECLINED("Duel décliné.", "Duel declined.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("duelDeclined")), "duelDeclined"),
    DUEL_RECEIVED_BY("Invitation pour un duel reçu de", "Invitation for a duel received by", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("invitationDuelReceivedBy")), "invitationDuelReceivedBy"),
    YOU_DO_NOT_HAVE_A_DUEL("Vous n'avez aucun duel.", "You do not have a duel.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("youDoNotHaveADuel")), "youDoNotHaveADuel"),
    YOU_ONLY_CAN_JOIN_DUEL_SPLEEF("Vous pouvez seulement rejoindre un Spleef en mode duel.", "You can only join a Spleef in duel mode.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("youCanOnlyJoinDuelSpleef")), "youCanOnlyJoinDuelSpleef"),
    SETTING_SAVED("Paramètre enregistré.", "Setting saved.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("settingSaved")), "settingSaved"),
    RED_TEAM("L'équipe §cRouge", "The §cRed team", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("redTeam")), "redTeam"),
    BLUE_TEAM("L'équipe §3Bleue", "The §3Blue team", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("blueTeam")), "blueTeam"),
    GREEN_TEAM("L'équipe §2Verte", "The §2Green team", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("greenTeam")), "greenTeam"),
    YELLOW_TEAM("L'équipe §eJaune", "The §eYellow team", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("yellowTeam")), "yellowTeam"),
    SPLEEF_PLAYER_RANKING("Classement des joueurs Spleef", "Spleef player ranking", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("spleefRanking")), "spleefRanking"),
    THE_MELTING_BEGINS("La fonte commence!", "The melting begings!", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("meltingBegings")), "meltingBegings"),
    DONT_STAY_ON_A_BLOCK("Ne restez pas sur le même bloc!", "Don't stay on the same block!", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("dontStayOnBlock")), "dontStayOnBlock"),
    COMMAND_PROHIBITED("Cette commande a été désactivée par un administrateur.", "This command has been prohibited by an administrator.", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("commandProhibited")), "commandProhibited"),
    NOT_FOUND("Introuvable.", "Not found", Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("notFound")), "notFound"),
    ;


    private final String msg1;
    private final String msg2;
    private final String path;

    Message(String s, String s1, String s2, String path) {
        String msg = s.replace("&", "§");
        this.msg1 = s1.replace("&", "§");
        this.msg2 = s2.replace("&", "§") + "";
        this.path = path;
    }

    public String getMessage() {
        return msg2;
    }

    public String getEnglishMessage() {
        return msg1;
    }

    public String getPath() {
        return path;
    }

    public enum SignColorTag {

        OPEN_WAIT_LINE2_0(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.wait.line2.ifPlayersSize>=max/4*3")), "signColorTag.open.wait.line2.ifPlayersSize>=max/4*3"),
        OPEN_WAIT_LINE2_1(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.wait.line2.ifPlayersSize>=max/2")), "signColorTag.open.wait.line2.ifPlayersSize>=max/2"),
        OPEN_WAIT_LINE2_2(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.wait.line2.else")), "signColorTag.open.wait.line2.else"),
        OPEN_WAIT_LINE3_0(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.wait.line3.ifPlayersSize>=min")), "signColorTag.open.wait.line3.ifPlayersSize>=min"),
        OPEN_WAIT_LINE3_1(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.wait.line3.else")), "signColorTag.open.wait.line3.else"),
        OPEN_WAIT_LINE4(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.wait.line4")), "signColorTag.open.wait.line4"),
        OPEN_GAME_LINE2_0(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.game.line2.ifPlayersSize>=max/4*3")), "signColorTag.open.game.line2.ifPlayersSize>=max/4*3"),
        OPEN_GAME_LINE2_1(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.game.line2.ifPlayersSize>=max/2")), "signColorTag.open.game.line2.ifPlayersSize>=max/2"),
        OPEN_GAME_LINE2_2(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.game.line2.else")), "signColorTag.open.game.line2.else"),
        OPEN_GAME_LINE4_NORMAL(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.game.line4.gameMode.normal")), "signColorTag.open.game.line4.gameMode.normal"),
        OPEN_GAME_LINE4_OTHER(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.open.game.line4.gameMode.other")), "signColorTag.open.game.line4.gameMode.other"),
        CLOSE_LINE2(Objects.requireNonNull(((SpleefPluginV1_13) SpleefPlugin.INSTANCE.getSpleefPlugin()).configurations.getMessages().getConfig().getString("signColorTag.close.line2")), "signColorTag.close.line2");

        private final String colorTag;
        private final String path;

        SignColorTag(String string, String path) {
            this.colorTag = string.replace("&", "§");
            this.path = path;
        }

        public String getColorTag() {
            return colorTag;
        }

        public String getPath() {
            return path;
        }
    }
}
