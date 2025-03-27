package dto;

import java.sql.Timestamp;

public class KeyboardLog {
    private int logId;
    private int keyboardId;
    private String action;
    private String memo;
    private Timestamp timestamp;

    public KeyboardLog(int keyboardId, String action, String memo) {
        this.keyboardId = keyboardId;
        this.action = action;
        this.memo = memo;
    }

    public int getKeyboardId() { return keyboardId; }
    public String getAction() { return action; }
    public String getMemo() { return memo; }
    public Timestamp getTimestamp() { return timestamp; }
}
