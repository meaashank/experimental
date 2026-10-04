package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface d<T> extends h, b, g {

    public static final class a {
        @InterfaceC4887e0(version = "1.3")
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

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void g() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void h() {
        }

        @InterfaceC4887e0(version = "1.4")
        public static /* synthetic */ void i() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void j() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void k() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void l() {
        }

        @InterfaceC4887e0(version = "1.5")
        public static /* synthetic */ void m() {
        }
    }

    boolean B();

    boolean E();

    @InterfaceC4887e0(version = "1.1")
    boolean J(@Nullable Object obj);

    boolean N();

    boolean P();

    @Nullable
    String Q();

    @NotNull
    List<r> R();

    boolean U();

    boolean equals(@Nullable Object obj);

    @Override // kotlin.reflect.h
    @NotNull
    Collection<c<?>> g();

    @NotNull
    List<s> getTypeParameters();

    @Nullable
    KVisibility getVisibility();

    int hashCode();

    boolean i();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    @Nullable
    String k();

    @NotNull
    Collection<d<?>> t();

    @NotNull
    Collection<i<T>> u();

    @NotNull
    List<d<? extends T>> w();

    @Nullable
    T y();
}
