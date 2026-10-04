package kotlinx.coroutines.channels;

import kotlinx.coroutines.O0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@O0
public final class TickerMode {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ TickerMode[] $VALUES;
    public static final TickerMode FIXED_PERIOD = new TickerMode("FIXED_PERIOD", 0);
    public static final TickerMode FIXED_DELAY = new TickerMode("FIXED_DELAY", 1);

    private static final /* synthetic */ TickerMode[] $values() {
        return new TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    static {
        TickerMode[] tickerModeArr$values = $values();
        $VALUES = tickerModeArr$values;
        $ENTRIES = kotlin.enums.c.c(tickerModeArr$values);
    }

    private TickerMode(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<TickerMode> getEntries() {
        return $ENTRIES;
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) $VALUES.clone();
    }
}
