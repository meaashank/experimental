package kd;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4841a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4841a f217431a = new C4841a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kd.a$a, reason: collision with other inner class name */
    @V({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class C0821a<T> extends AbstractC4843c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q<n<?>, T, T, L0> f217432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0821a(T t10, q<? super n<?>, ? super T, ? super T, L0> qVar) {
            super(t10);
            this.f217432b = qVar;
        }

        @Override // kd.AbstractC4843c
        public void afterChange(n<?> property, T t10, T t11) {
            G.p(property, "property");
            this.f217432b.invoke(property, t10, t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kd.a$b */
    @V({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class b<T> extends AbstractC4843c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q<n<?>, T, T, Boolean> f217433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t10, q<? super n<?>, ? super T, ? super T, Boolean> qVar) {
            super(t10);
            this.f217433b = qVar;
        }

        @Override // kd.AbstractC4843c
        public boolean beforeChange(n<?> property, T t10, T t11) {
            G.p(property, "property");
            return this.f217433b.invoke(property, t10, t11).booleanValue();
        }
    }

    @NotNull
    public final <T> InterfaceC4846f<Object, T> a() {
        return new C4842b();
    }

    @NotNull
    public final <T> InterfaceC4846f<Object, T> b(T t10, @NotNull q<? super n<?>, ? super T, ? super T, L0> onChange) {
        G.p(onChange, "onChange");
        return new C0821a(t10, onChange);
    }

    @NotNull
    public final <T> InterfaceC4846f<Object, T> c(T t10, @NotNull q<? super n<?>, ? super T, ? super T, Boolean> onChange) {
        G.p(onChange, "onChange");
        return new b(t10, onChange);
    }
}
