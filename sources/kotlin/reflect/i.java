package kotlin.reflect;

import kotlin.A;
import kotlin.InterfaceC4887e0;

/* JADX INFO: loaded from: classes7.dex */
public interface i<R> extends c<R>, A<R> {

    public static final class a {
        @InterfaceC4887e0(version = "1.1")
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
    }

    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.c
    boolean isSuspend();
}
