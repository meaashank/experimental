package dagger.internal;

import bc.InterfaceC2856f;

/* JADX INFO: loaded from: classes7.dex */
public final class MembersInjectors {

    public enum NoOpMembersInjector implements InterfaceC2856f<Object> {
        INSTANCE;

        @Override // bc.InterfaceC2856f
        public void injectMembers(Object instance) {
            j.b(instance, "Cannot inject members into a null reference");
        }
    }

    public static <T> InterfaceC2856f<T> a() {
        return NoOpMembersInjector.INSTANCE;
    }
}
