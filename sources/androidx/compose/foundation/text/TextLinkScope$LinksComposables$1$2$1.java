package androidx.compose.foundation.text;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1", f = "TextLinkScope.kt", i = {}, l = {Opcodes.RETURN}, m = "invokeSuspend", n = {}, s = {})
public final class TextLinkScope$LinksComposables$1$2$1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1828q f93526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.g f93527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$2$1(C1828q c1828q, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.e<? super TextLinkScope$LinksComposables$1$2$1> eVar) {
        super(2, eVar);
        this.f93526b = c1828q;
        this.f93527c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new TextLinkScope$LinksComposables$1$2$1(this.f93526b, this.f93527c, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f93525a;
        if (i10 == 0) {
            C4885d0.n(obj);
            C1828q c1828q = this.f93526b;
            androidx.compose.foundation.interaction.g gVar = this.f93527c;
            this.f93525a = 1;
            if (c1828q.e(gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((TextLinkScope$LinksComposables$1$2$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
