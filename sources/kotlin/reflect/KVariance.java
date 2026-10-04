package kotlin.reflect;

import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public final class KVariance {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ KVariance[] $VALUES;
    public static final KVariance INVARIANT = new KVariance("INVARIANT", 0);
    public static final KVariance IN = new KVariance("IN", 1);
    public static final KVariance OUT = new KVariance("OUT", 2);

    private static final /* synthetic */ KVariance[] $values() {
        return new KVariance[]{INVARIANT, IN, OUT};
    }

    static {
        KVariance[] kVarianceArr$values = $values();
        $VALUES = kVarianceArr$values;
        $ENTRIES = kotlin.enums.c.c(kVarianceArr$values);
    }

    private KVariance(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<KVariance> getEntries() {
        return $ENTRIES;
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) $VALUES.clone();
    }
}
