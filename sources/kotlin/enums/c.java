package kotlin.enums;

import com.mbridge.msdk.MBridgeConstans;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.NotImplementedError;
import kotlin.O0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
    @O0(markerClass = {InterfaceC5043v.class})
    public static final /* synthetic */ <T extends Enum<T>> a<T> a() {
        throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC4887e0(version = "1.8")
    @InterfaceC4850b0
    @NotNull
    public static final <E extends Enum<E>> a<E> b(@NotNull InterfaceC4376a<E[]> entriesProvider) {
        G.p(entriesProvider, "entriesProvider");
        return new EnumEntriesList(entriesProvider.invoke());
    }

    @InterfaceC4887e0(version = "1.8")
    @InterfaceC4850b0
    @NotNull
    public static final <E extends Enum<E>> a<E> c(@NotNull E[] entries) {
        G.p(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
