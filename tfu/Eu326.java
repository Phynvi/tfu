/*
 * Decompiled with CFR 0.146.
 */
package tfu;

public enum Eu326 {
    NO_TIMEOUT(0),
    EVENT_KEYBOARD(-1),
    EVENT_MOUSE_CLICK(6),
    EVENT_MOUSE_MOVE(-1),
    EVENT_APPLET_FOCUS(1),
    EVENT_CAMERA_POSITION(20),
    DETECT_MODIFIED_CLIENT(4),
    WINDOW_STATUS(6),
    REFLECTION_CHECK_REPLY(-1),
    RESUME_PAUSEBUTTON(6),
    CLOSE_MODAL(0),
    RESUME_P_COUNTDIALOG(4),
    RESUME_P_NAMEDIALOG(-1),
    FACE_SQUARE(4),
    URL_REQUEST(-1),
    TRANSMITVAR_VERIFYID(4),
    RESUME_P_OBJDIALOG(2),
    CLAN_JOINCHAT_LEAVECHAT(-1),
    CLAN_KICKUSER(-1),
    RESUME_P_STRINGDIALOG(-1),
    RESUME_P_CLANFORUMQFCDIALOG(-1),
    MAP_BUILD_COMPLETE(0),
    SEND_SNAPSHOT(-1),
    IGNORELIST_DEL(-1),
    IGNORELIST_ADD(-1),
    SET_CHATFILTERSETTINGS(3),
    MESSAGE_PRIVATE(-2),
    FRIENDLIST_DEL(-1),
    FRIENDLIST_ADD(-1),
    CLIENT_CHEAT(-1),
    MESSAGE_PUBLIC(-1),
    PING_STATISTICS(2),
    CHAT_SETMODE(1),
    RESUME_P_HSLDIALOG(2),
    SEND_PING_REPLY(8),
    SCRIPT_MESSAGE(-2),
    WORLDLIST_FETCH(4),
    BETA_CODE_REQUEST(-1),
    SEND_EMAIL_VALIDATION_CODE(-1),
    CHANGE_EMAIL_ADDRESS(-2),
    GENERIC_BROADCAST_EVENT(-2),
    GENERIC_BROADCAST_STATE(-2),
    STATEEVENT_EVENTSBUFFER(-2),
    PLAYER_LOGIN(0),
    PHYSICSCONTROLDEBUGGER_STATE(-2);
    
    public final int ax;

    private Eu326(int n2) {
        this.ax = n2;
    }
}
