package O;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import e.T;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(26)
@V({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,143:1\n26#2:144\n26#2:145\n26#2:146\n26#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n56#1:144\n57#1:145\n58#1:146\n59#1:147\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
@androidx.compose.ui.i
public final class f implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f65112d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f65113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final A f65114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AutofillManager f65115c;

    public f(@NotNull View view, @NotNull A a10) {
        this.f65113a = view;
        this.f65114b = a10;
        AutofillManager autofillManagerA = d.a(view.getContext().getSystemService(C1274c.a()));
        if (autofillManagerA == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f65115c = autofillManagerA;
        view.setImportantForAutofill(1);
    }

    @Override // O.j
    public void a(@NotNull z zVar) {
        this.f65115c.notifyViewExited(this.f65113a, zVar.f65129d);
    }

    @Override // O.j
    public void b(@NotNull z zVar) {
        P.j jVar = zVar.f65127b;
        if (jVar == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.f65115c.notifyViewEntered(this.f65113a, zVar.f65129d, new Rect(Math.round(jVar.f65511a), Math.round(jVar.f65512b), Math.round(jVar.f65513c), Math.round(jVar.f65514d)));
    }

    @NotNull
    public final AutofillManager c() {
        return this.f65115c;
    }

    @NotNull
    public final A d() {
        return this.f65114b;
    }

    @NotNull
    public final View e() {
        return this.f65113a;
    }
}
