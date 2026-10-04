package R1;

import S1.i;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p0 f67694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final m0.c f67695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f67696c;

    public i(@NotNull p0 store, @NotNull m0.c factory, @NotNull a extras) {
        G.p(store, "store");
        G.p(factory, "factory");
        G.p(extras, "extras");
        this.f67694a = store;
        this.f67695b = factory;
        this.f67696c = extras;
    }

    public static /* synthetic */ k0 b(i iVar, kotlin.reflect.d dVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = S1.i.f68117a.f(dVar);
        }
        return iVar.a(dVar, str);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public final <T extends k0> T a(@NotNull kotlin.reflect.d<T> modelClass, @NotNull String key) {
        G.p(modelClass, "modelClass");
        G.p(key, "key");
        T t10 = (T) this.f67694a.b(key);
        if (!modelClass.J(t10)) {
            e eVar = new e(this.f67696c);
            eVar.c(i.a.f68119a, key);
            T t11 = (T) j.a(this.f67695b, modelClass, eVar);
            this.f67694a.d(key, t11);
            return t11;
        }
        Object obj = this.f67695b;
        if (obj instanceof m0.e) {
            G.m(t10);
            ((m0.e) obj).d(t10);
        }
        G.n(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return t10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull q0 owner, @NotNull m0.c factory, @NotNull a extras) {
        this(owner.getViewModelStore(), factory, extras);
        G.p(owner, "owner");
        G.p(factory, "factory");
        G.p(extras, "extras");
    }
}
