package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultCallerLauncher$resultContract$2;
import androidx.core.app.C2382e;
import d.AbstractC4282a;
import ed.InterfaceC4376a;
import kotlin.G;
import kotlin.I;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends g<L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g<I> f85039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC4282a<I, O> f85040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f85041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final G f85042d = I.a(new InterfaceC4376a<ActivityResultCallerLauncher$resultContract$2.a>(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ActivityResultCallerLauncher<I, O> f85043d;

        /* JADX INFO: Add missing generic type declarations: [O] */
        public static final class a<O> extends AbstractC4282a<L0, O> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActivityResultCallerLauncher<I, O> f85044a;

            public a(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
                this.f85044a = activityResultCallerLauncher;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // d.AbstractC4282a
            public O c(int i10, @Nullable Intent intent) {
                return this.f85044a.f85040b.c(i10, intent);
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
            @Override // d.AbstractC4282a
            @NotNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Intent a(@NotNull Context context, @NotNull L0 l02) {
                ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.f85044a;
                return activityResultCallerLauncher.f85040b.a(context, activityResultCallerLauncher.f85041c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.f85043d = this;
        }

        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(this.f85043d);
        }
    });

    public ActivityResultCallerLauncher(@NotNull g<I> gVar, @NotNull AbstractC4282a<I, O> abstractC4282a, I i10) {
        this.f85039a = gVar;
        this.f85040b = abstractC4282a;
        this.f85041c = i10;
    }

    @Override // androidx.activity.result.g
    @NotNull
    public AbstractC4282a<L0, ?> a() {
        return h();
    }

    @Override // androidx.activity.result.g
    public void d() {
        this.f85039a.d();
    }

    @NotNull
    public final AbstractC4282a<I, O> e() {
        return this.f85040b;
    }

    public final I f() {
        return this.f85041c;
    }

    @NotNull
    public final g<I> g() {
        return this.f85039a;
    }

    @NotNull
    public final AbstractC4282a<L0, O> h() {
        return (AbstractC4282a) this.f85042d.getValue();
    }

    @Override // androidx.activity.result.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(@NotNull L0 l02, @Nullable C2382e c2382e) {
        this.f85039a.c(this.f85041c, c2382e);
    }
}
