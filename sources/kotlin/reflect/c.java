package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface c<R> extends b {

    public static final class a {
        @Xc.g
        public static /* synthetic */ void a() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void b() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void c() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void d() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void e() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void f() {
        }

        @InterfaceC4887e0(version = "1.3")
        public static /* synthetic */ void g() {
        }
    }

    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<KParameter, ? extends Object> map);

    @NotNull
    String getName();

    @NotNull
    List<KParameter> getParameters();

    @NotNull
    r getReturnType();

    @NotNull
    List<s> getTypeParameters();

    @Nullable
    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
