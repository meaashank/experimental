package kotlinx.coroutines.channels;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class BufferOverflow {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ BufferOverflow[] $VALUES;
    public static final BufferOverflow SUSPEND = new BufferOverflow("SUSPEND", 0);
    public static final BufferOverflow DROP_OLDEST = new BufferOverflow("DROP_OLDEST", 1);
    public static final BufferOverflow DROP_LATEST = new BufferOverflow("DROP_LATEST", 2);

    private static final /* synthetic */ BufferOverflow[] $values() {
        return new BufferOverflow[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        BufferOverflow[] bufferOverflowArr$values = $values();
        $VALUES = bufferOverflowArr$values;
        $ENTRIES = kotlin.enums.c.c(bufferOverflowArr$values);
    }

    private BufferOverflow(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<BufferOverflow> getEntries() {
        return $ENTRIES;
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) $VALUES.clone();
    }
}
