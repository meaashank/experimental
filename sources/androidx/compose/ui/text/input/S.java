package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.foundation.text.input.internal.T0;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,459:1\n86#1,5:460\n86#1,5:465\n86#1,5:470\n86#1,5:475\n86#1,5:480\n86#1,5:485\n86#1,5:490\n86#1,5:495\n86#1,5:500\n86#1,5:505\n86#1,5:510\n86#1,5:515\n86#1,5:520\n86#1,5:525\n86#1,5:530\n86#1,5:535\n86#1,5:540\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n146#1:460,5\n182#1:465,5\n187#1:470,5\n193#1:475,5\n201#1:480,5\n212#1:485,5\n218#1:490,5\n224#1:495,5\n230#1:500,5\n266#1:505,5\n350#1:510,5\n376#1:515,5\n399#1:520,5\n409#1:525,5\n421#1:530,5\n441#1:535,5\n450#1:540,5\n*E\n"})
@InterfaceC4982o(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@androidx.compose.runtime.internal.r(parameters = 0)
public final class S implements InputConnection {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104726i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2349s f104727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public TextFieldValue f104730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f104732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC2340i> f104733g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f104734h = true;

    public S(@NotNull TextFieldValue textFieldValue, @NotNull InterfaceC2349s interfaceC2349s, boolean z10) {
        this.f104727a = interfaceC2349s;
        this.f104728b = z10;
        this.f104730d = textFieldValue;
    }

    public final void b(InterfaceC2340i interfaceC2340i) {
        c();
        try {
            this.f104733g.add(interfaceC2340i);
        } finally {
            d();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        c();
        return true;
    }

    public final boolean c() {
        this.f104729c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f104734h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f104733g.clear();
        this.f104729c = 0;
        this.f104734h = false;
        this.f104727a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z10 = this.f104734h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        boolean z10 = this.f104734h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z10 = this.f104734h;
        return z10 ? this.f104728b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f104734h;
        if (z10) {
            b(new C2333b(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final boolean d() {
        int i10 = this.f104729c - 1;
        this.f104729c = i10;
        if (i10 == 0 && !this.f104733g.isEmpty()) {
            this.f104727a.b(kotlin.collections.U.d6(this.f104733g));
            this.f104733g.clear();
        }
        return this.f104729c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        b(new C2338g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        b(new C2339h(i10, i11));
        return true;
    }

    public final boolean e(InterfaceC4376a<L0> interfaceC4376a) {
        boolean z10 = this.f104734h;
        if (z10) {
            interfaceC4376a.invoke();
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    public final boolean f() {
        return this.f104728b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        b(new C2344m());
        return true;
    }

    @NotNull
    public final InterfaceC2349s g() {
        return this.f104727a;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        TextFieldValue textFieldValue = this.f104730d;
        return TextUtils.getCapsMode(textFieldValue.f104741a.f104196a, androidx.compose.ui.text.Z.l(textFieldValue.f104742b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f104732f = z10;
        if (z10) {
            this.f104731e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return C2352v.a(this.f104730d);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i10) {
        if (androidx.compose.ui.text.Z.h(this.f104730d.f104742b)) {
            return null;
        }
        return X.a(this.f104730d).f104196a;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return X.b(this.f104730d, i10).f104196a;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return X.c(this.f104730d, i10).f104196a;
    }

    @NotNull
    public final TextFieldValue h() {
        return this.f104730d;
    }

    public final void i(String str) {
    }

    public final void j(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    public final void k(@NotNull TextFieldValue textFieldValue) {
        this.f104730d = textFieldValue;
    }

    public final void l(@NotNull TextFieldValue textFieldValue, @NotNull InterfaceC2351u interfaceC2351u) {
        if (this.f104734h) {
            this.f104730d = textFieldValue;
            if (this.f104732f) {
                interfaceC2351u.e(this.f104731e, C2352v.a(textFieldValue));
            }
            androidx.compose.ui.text.Z z10 = textFieldValue.f104743c;
            int iL = z10 != null ? androidx.compose.ui.text.Z.l(z10.f104408a) : -1;
            androidx.compose.ui.text.Z z11 = textFieldValue.f104743c;
            interfaceC2351u.a(androidx.compose.ui.text.Z.l(textFieldValue.f104742b), androidx.compose.ui.text.Z.k(textFieldValue.f104742b), iL, z11 != null ? androidx.compose.ui.text.Z.k(z11.f104408a) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f104734h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new W(0, this.f104730d.f104741a.f104196a.length()));
                    break;
                case R.id.cut:
                    j(277);
                    break;
                case R.id.copy:
                    j(278);
                    break;
                case R.id.paste:
                    j(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104823f;
                    break;
                case 3:
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104824g;
                    break;
                case 4:
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104825h;
                    break;
                case 5:
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104827j;
                    break;
                case 6:
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104828k;
                    break;
                case 7:
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104826i;
                    break;
                default:
                    T0.a("IME sends unsupported Editor Action: ", i10, "RecordingIC");
                    C2348q.f104819b.getClass();
                    i11 = C2348q.f104821d;
                    break;
            }
        } else {
            C2348q.f104819b.getClass();
            i11 = C2348q.f104821d;
        }
        this.f104727a.a(i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z10 = this.f104734h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f104734h;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f104727a.d(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        this.f104727a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f104734h;
        if (z10) {
            b(new U(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f104734h;
        if (z10) {
            b(new V(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f104734h;
        if (!z10) {
            return z10;
        }
        b(new W(i10, i11));
        return true;
    }
}
