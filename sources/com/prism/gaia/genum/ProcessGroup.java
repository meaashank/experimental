package com.prism.gaia.genum;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class ProcessGroup {
    private static final /* synthetic */ ProcessGroup[] $VALUES;
    public static final ProcessGroup ALL;
    public static final ProcessGroup GUEST_ONLY;
    public static final ProcessGroup SUPERVISOR_AND_GUEST;
    public static final ProcessGroup SUPERVISOR_ONLY;
    private final int flag;

    private static /* synthetic */ ProcessGroup[] $values() {
        return new ProcessGroup[]{ALL, GUEST_ONLY, SUPERVISOR_ONLY, SUPERVISOR_AND_GUEST};
    }

    static {
        ProcessType processType = ProcessType.SUPERVISOR;
        int flag = processType.getFlag() | ProcessType.MAIN_PROCESS_PER_SPACE.getFlag();
        ProcessType processType2 = ProcessType.GUEST;
        ALL = new ProcessGroup("ALL", 0, flag | processType2.getFlag());
        GUEST_ONLY = new ProcessGroup("GUEST_ONLY", 1, processType2.getFlag());
        SUPERVISOR_ONLY = new ProcessGroup("SUPERVISOR_ONLY", 2, processType.getFlag());
        SUPERVISOR_AND_GUEST = new ProcessGroup("SUPERVISOR_AND_GUEST", 3, processType.getFlag() | processType2.getFlag());
        $VALUES = $values();
    }

    private ProcessGroup(String str, int i10, int i11) {
        this.flag = i11;
    }

    public static ProcessGroup valueOf(String str) {
        return (ProcessGroup) Enum.valueOf(ProcessGroup.class, str);
    }

    public static ProcessGroup[] values() {
        return (ProcessGroup[]) $VALUES.clone();
    }

    public boolean contains(ProcessType processType) {
        return (processType.getFlag() & this.flag) != 0;
    }
}
