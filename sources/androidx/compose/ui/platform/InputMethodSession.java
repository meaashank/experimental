package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ed.InterfaceC4376a;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,184:1\n1208#2:185\n1187#2,2:186\n36#3:188\n36#3:190\n1#4:189\n460#5,11:191\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n124#1:185\n124#1:186,2\n137#1:188\n176#1:190\n179#1:191,11\n*E\n"})
public final class InputMethodSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final E0 f103589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<kotlin.L0> f103590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f103591c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public androidx.compose.runtime.collection.c<WeakReference<androidx.compose.ui.text.input.A>> f103592d = new androidx.compose.runtime.collection.c<>(new WeakReference[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f103593e;

    public InputMethodSession(@NotNull E0 e02, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        this.f103589a = e02;
        this.f103590b = interfaceC4376a;
    }

    @Nullable
    public final InputConnection c(@NotNull EditorInfo editorInfo) {
        synchronized (this.f103591c) {
            if (this.f103593e) {
                return null;
            }
            androidx.compose.ui.text.input.A a10 = androidx.compose.ui.text.input.K.a(this.f103589a.a(editorInfo), new ed.l<androidx.compose.ui.text.input.A, kotlin.L0>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                public final void e(@NotNull androidx.compose.ui.text.input.A a11) {
                    int i10;
                    a11.a();
                    androidx.compose.runtime.collection.c<WeakReference<androidx.compose.ui.text.input.A>> cVar = this.f103594d.f103592d;
                    int i11 = cVar.f99566c;
                    if (i11 <= 0) {
                        i10 = -1;
                        break;
                    }
                    WeakReference<androidx.compose.ui.text.input.A>[] weakReferenceArr = cVar.f99564a;
                    i10 = 0;
                    while (!kotlin.jvm.internal.G.g(weakReferenceArr[i10], a11)) {
                        i10++;
                        if (i10 >= i11) {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 >= 0) {
                        this.f103594d.f103592d.l0(i10);
                    }
                    if (this.f103594d.f103592d.U()) {
                        this.f103594d.f103590b.invoke();
                    }
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(androidx.compose.ui.text.input.A a11) {
                    e(a11);
                    return kotlin.L0.f217464a;
                }
            });
            this.f103592d.b(new WeakReference<>(a10));
            return a10;
        }
    }

    public final void d() {
        synchronized (this.f103591c) {
            try {
                this.f103593e = true;
                androidx.compose.runtime.collection.c<WeakReference<androidx.compose.ui.text.input.A>> cVar = this.f103592d;
                int i10 = cVar.f99566c;
                if (i10 > 0) {
                    WeakReference<androidx.compose.ui.text.input.A>[] weakReferenceArr = cVar.f99564a;
                    int i11 = 0;
                    do {
                        androidx.compose.ui.text.input.A a10 = weakReferenceArr[i11].get();
                        if (a10 != null) {
                            a10.a();
                        }
                        i11++;
                    } while (i11 < i10);
                }
                this.f103592d.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return !this.f103593e;
    }
}
