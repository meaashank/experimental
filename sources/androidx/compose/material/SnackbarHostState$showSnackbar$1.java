package androidx.compose.material;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.x;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {387, 390}, m = "showSnackbar", n = {"this", PglCryptUtils.KEY_MESSAGE, "actionLabel", x.h.f238399b, "$this$withLock_u24default$iv", "this", PglCryptUtils.KEY_MESSAGE, "actionLabel", x.h.f238399b, "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f97487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f97488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f97489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f97490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f97491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f97492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f97493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SnackbarHostState f97494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97495i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, kotlin.coroutines.e<? super SnackbarHostState$showSnackbar$1> eVar) {
        super(eVar);
        this.f97494h = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97493g = obj;
        this.f97495i |= Integer.MIN_VALUE;
        return this.f97494h.d(null, null, null, this);
    }
}
