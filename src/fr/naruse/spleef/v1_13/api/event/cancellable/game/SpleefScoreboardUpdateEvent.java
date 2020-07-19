package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.util.board.ScoreboardSign;

@SpleefCancellable
public class SpleefScoreboardUpdateEvent extends SpleefCancellableEvent {
    private final ScoreboardSign scoreboardSign;
    private String line;
    private int score;

    public SpleefScoreboardUpdateEvent(SpleefPluginV1_13 pl, String line, int score, ScoreboardSign scoreboardSign) {
        super(pl, "SpleefScoreboardUpdateEvent");
        this.line = line;
        this.score = score;
        this.scoreboardSign = scoreboardSign;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ScoreboardSign getScoreboardSign() {
        return scoreboardSign;
    }
}
