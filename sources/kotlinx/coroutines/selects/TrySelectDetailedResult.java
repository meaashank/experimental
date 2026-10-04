package kotlinx.coroutines.selects;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TrySelectDetailedResult {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ TrySelectDetailedResult[] $VALUES;
    public static final TrySelectDetailedResult SUCCESSFUL = new TrySelectDetailedResult("SUCCESSFUL", 0);
    public static final TrySelectDetailedResult REREGISTER = new TrySelectDetailedResult("REREGISTER", 1);
    public static final TrySelectDetailedResult CANCELLED = new TrySelectDetailedResult("CANCELLED", 2);
    public static final TrySelectDetailedResult ALREADY_SELECTED = new TrySelectDetailedResult("ALREADY_SELECTED", 3);

    private static final /* synthetic */ TrySelectDetailedResult[] $values() {
        return new TrySelectDetailedResult[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        TrySelectDetailedResult[] trySelectDetailedResultArr$values = $values();
        $VALUES = trySelectDetailedResultArr$values;
        $ENTRIES = kotlin.enums.c.c(trySelectDetailedResultArr$values);
    }

    private TrySelectDetailedResult(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<TrySelectDetailedResult> getEntries() {
        return $ENTRIES;
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) $VALUES.clone();
    }
}
