package kotlin.contracts;

import Sc.f;
import Xc.b;
import com.prism.lib_google_billing.q;
import kotlin.InterfaceC4887e0;
import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@f
@b
public final class InvocationKind {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InvocationKind[] $VALUES;

    @b
    public static final InvocationKind AT_MOST_ONCE = new InvocationKind("AT_MOST_ONCE", 0);

    @b
    public static final InvocationKind AT_LEAST_ONCE = new InvocationKind("AT_LEAST_ONCE", 1);

    @b
    public static final InvocationKind EXACTLY_ONCE = new InvocationKind("EXACTLY_ONCE", 2);

    @b
    public static final InvocationKind UNKNOWN = new InvocationKind(q.f194113a, 3);

    private static final /* synthetic */ InvocationKind[] $values() {
        return new InvocationKind[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    static {
        InvocationKind[] invocationKindArr$values = $values();
        $VALUES = invocationKindArr$values;
        $ENTRIES = c.c(invocationKindArr$values);
    }

    private InvocationKind(String str, int i10) {
    }

    @NotNull
    public static a<InvocationKind> getEntries() {
        return $ENTRIES;
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) $VALUES.clone();
    }
}
