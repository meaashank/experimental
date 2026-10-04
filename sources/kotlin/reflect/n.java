package kotlin.reflect;

import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface n<V> extends kotlin.reflect.c<V> {

    public interface a<V> {
        @NotNull
        n<V> a();
    }

    public static final class b {
        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void a() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void b() {
        }
    }

    public interface c<V> extends a<V>, i<V> {
    }

    @NotNull
    c<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
