/*
 * Decompiled with CFR 0.146.
 */
package tfu;

import tfu.Lm295;
import tfu.Lv148;

public enum Lb33 {
    MainRedraw,
    UpdateGameplayStates,
    GameDraw,
    ProcessScript,
    Physics,
    MainLoop,
    NetStats,
    NetClient,
    Js5Archive,
    ServiceJs5Native,
    Video,
    LuaNative,
    RemovePhantomLuaRefs,
    ThreadEvents,
    XElementQueue,
    XElementLibraryQueue,
    XElement_CalculatePriority,
    Js5NativeInterface,
    zSoundManager,
    zDebug,
    zEvents,
    zMainLoopBeginning,
    Loading,
    zAudioRender,
    zTweening,
    zGamedrawmain,
    zNavPower,
    zNativeRender,
    zGraphicsSync,
    MainLoad,
    MapBuild,
    BuildXMap_XElement_trigger,
    Sound,
    GameLoop,
    TCPin,
    UDP,
    SyncIncoming,
    SyncOutgoing,
    ReflectionReceiver,
    DebugDialog,
    WorldProcess,
    VariableSystem,
    SendScriptMessages,
    Login,
    NotLoggedInLoop,
    ProcessActiveLogin,
    MainTCPIn,
    Main_dorespawn,
    MainDoLogouts,
    XAreaInstanceBuild,
    SendState,
    P2Pservice,
    Idle,
    IncomingP2P,
    AutoAdmin,
    Misc,
    NewPlayerConnections,
    TCP,
    SendScheduledMovement,
    ProcessNPCs,
    PerNPC,
    NPCRunBehavior,
    NPCPathFinding,
    NavPowerRenders,
    NPC_XElement_trigger,
    ProcessBroadcasts,
    ProcessPlayers,
    SendDynamicStateCounts,
    LoginQueue,
    ProcessBots,
    Autosave,
    ServiceStateChannel,
    AsyncJobQueue,
    ProcessPhysics,
    AreaUpdate,
    ReflectionTest,
    Friends,
    GameNote,
    Clan,
    ChatMessage,
    MicroTransactions,
    RoundTripProfiling,
    Respawn,
    Logout,
    CheckUID,
    FullVarp,
    Build,
    Players,
    NPCs,
    SendNpcAppeared,
    SendNpcGone,
    SendNpcHardcoded,
    NavPowerDebug,
    Zones,
    Inv,
    VarClan,
    VarClanDisable,
    TransmitVar,
    RebootTimer,
    AffinedClanChannelFull,
    AffinedClanSettingsFull,
    FriendChatChannelList,
    GuestChatChannelFull,
    GuestClanSettingsFull,
    SendFriendsState,
    Flush,
    ClearMasks,
    ReceivePackets,
    ProcessIncoming,
    SendOutgoing,
    ResourceCallbacks,
    NPC_runBehaviour,
    FactionWarCounterNodeUpdate,
    CreateAreaInstance,
    FlushControls,
    NewGameEntity,
    NewGameEntityBody,
    UpdateEntitesById,
    EntitesByIdRemove,
    EntitesByIdPut,
    AddCommonEventHandlers,
    GameEntityConstructStack,
    GameEntityConstructBuilder,
    GameEntityConstructAppend,
    GameEntityConstructPut,
    GetAllBroadcastersAndReceivers,
    DetectBroadcasterMovement,
    DetectReceiverMovement,
    ProcessQueuedBroadcastRecalculates,
    ProcessPendingBroadcasts,
    ClearPendingBroadcasts,
    GameEntityIdAllocate,
    IdProcessGcInitial,
    IdAttemptAll,
    IdAttemptOne,
    IdSystemGc,
    IdProcessGcLater,
    IdShuffle,
    IdsInUseCheck,
    IdLastMinuteCheck,
    LuaConsole,
    DebugConsole,
    LoadHeightmaps,
    DetectOneReceiverMovement,
    UpdateBorderSets,
    RemoveNotBiggerSet,
    AddFromBiggerSet,
    DetectReceiverChanges,
    RecalculateReceiverSetup,
    RecalculateReceiverLoop,
    RecalculateReceiverBody,
    GetVisibility,
    CompareVisibility,
    ReceiveState,
    ReceiveEvent,
    ReceiveAppeared,
    ReceiveGone,
    CheckReceiveAppeared,
    TransferFullState,
    TransferMessage,
    CheckReceiveGone,
    RecalculateVisibilityNow,
    WrangleAppearedServer,
    WrangleAppearedClient,
    WrangleGoneServer,
    WrangleGoneClient,
    EntityTriggerEventHash,
    EntityTriggerEventName,
    AutoForwardState,
    AutoForwardEvent,
    GeoEntReceiveAppeared,
    GeoEntReceiveGone,
    GraphicsResourceFactory,
    ContructToolkitLoading,
    InitNative,
    RegisterSharedJs5,
    InitNativeResourceLoader,
    CreateScriptManager,
    InitGraphicsJava,
    GetDefaultCamera,
    InitFromCanvas,
    CreateGroundCover,
    InitDrawHelper,
    AddBaseMediaPath,
    AddBaseShaderPath,
    JS5Open,
    MainThreadExecutor,
    ReleaseResources,
    Audio,
    FmodFile,
    FmodEvent,
    Fmod_getEvent,
    Fmod_initAndPlay,
    MusicManager,
    AudioLoc,
    EngineAudio,
    UpdateFModCamera,
    FmodEventSystem,
    FmodDownload;
    
    private Lm295 gs;

    public static void d(Lb33 lb33) {
        if (lb33.gs != null) {
            lb33.gs.d();
        }
    }

    public static void g(Lb33 lb33) {
        if (lb33.gs == null) {
            lb33.gs = Lv148.q(lb33.name());
        }
        if (lb33.gs != null) {
            lb33.gs.g();
        }
    }
}

