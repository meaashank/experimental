package androidx.compose.runtime.saveable;

import androidx.compose.runtime.InterfaceC1934n1;
import androidx.compose.runtime.saveable.c;
import ed.InterfaceC4376a;
import java.util.Arrays;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class SaveableHolder<T> implements f, InterfaceC1934n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public e<T, Object> f99989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public c f99990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f99991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f99992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Object[] f99993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c.a f99994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Object> f99995g = new InterfaceC4376a<Object>(this) { // from class: androidx.compose.runtime.saveable.SaveableHolder$valueProvider$1

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SaveableHolder<T> f99996d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.f99996d = this;
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
        @Override // ed.InterfaceC4376a
        @Nullable
        public final Object invoke() {
            SaveableHolder<T> saveableHolder = this.f99996d;
            e<T, Object> eVar = saveableHolder.f99989a;
            T t10 = saveableHolder.f99992d;
            if (t10 != 0) {
                return eVar.a(saveableHolder, t10);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    };

    public SaveableHolder(@NotNull e<T, Object> eVar, @Nullable c cVar, @NotNull String str, T t10, @NotNull Object[] objArr) {
        this.f99989a = eVar;
        this.f99990b = cVar;
        this.f99991c = str;
        this.f99992d = t10;
        this.f99993e = objArr;
    }

    private final void h() {
        c cVar = this.f99990b;
        if (this.f99994f != null) {
            throw new IllegalArgumentException(("entry(" + this.f99994f + ") is not null").toString());
        }
        if (cVar != null) {
            RememberSaveableKt.f(cVar, this.f99995g.invoke());
            this.f99994f = cVar.b(this.f99991c, this.f99995g);
        }
    }

    @Override // androidx.compose.runtime.saveable.f
    public boolean a(@NotNull Object obj) {
        c cVar = this.f99990b;
        return cVar == null || cVar.a(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void b() {
        h();
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void c() {
        c.a aVar = this.f99994f;
        if (aVar != null) {
            aVar.unregister();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void d() {
        c.a aVar = this.f99994f;
        if (aVar != null) {
            aVar.unregister();
        }
    }

    @Nullable
    public final T g(@NotNull Object[] objArr) {
        if (Arrays.equals(objArr, this.f99993e)) {
            return this.f99992d;
        }
        return null;
    }

    public final void i(@NotNull e<T, Object> eVar, @Nullable c cVar, @NotNull String str, T t10, @NotNull Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f99990b != cVar) {
            this.f99990b = cVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (G.g(this.f99991c, str)) {
            z11 = z10;
        } else {
            this.f99991c = str;
        }
        this.f99989a = eVar;
        this.f99992d = t10;
        this.f99993e = objArr;
        c.a aVar = this.f99994f;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.unregister();
        }
        this.f99994f = null;
        h();
    }
}
