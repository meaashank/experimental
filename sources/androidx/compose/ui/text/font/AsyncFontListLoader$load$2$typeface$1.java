package androidx.compose.ui.text.font;

import androidx.media.AudioAttributesCompat;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {AudioAttributesCompat.f114436O}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements ed.l<kotlin.coroutines.e<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f104453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2324v f104454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, InterfaceC2324v interfaceC2324v, kotlin.coroutines.e<? super AsyncFontListLoader$load$2$typeface$1> eVar) {
        super(1, eVar);
        this.f104453b = asyncFontListLoader;
        this.f104454c = interfaceC2324v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@NotNull kotlin.coroutines.e<?> eVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.f104453b, this.f104454c, eVar);
    }

    @Override // ed.l
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@Nullable kotlin.coroutines.e<Object> eVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f104452a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return obj;
        }
        C4885d0.n(obj);
        AsyncFontListLoader asyncFontListLoader = this.f104453b;
        InterfaceC2324v interfaceC2324v = this.f104454c;
        this.f104452a = 1;
        Object objJ = asyncFontListLoader.j(interfaceC2324v, this);
        return objJ == coroutineSingletons ? coroutineSingletons : objJ;
    }
}
