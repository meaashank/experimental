package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.G1;
import androidx.compose.ui.text.input.C2333b;
import androidx.compose.ui.text.input.C2338g;
import androidx.compose.ui.text.input.C2339h;
import androidx.compose.ui.text.input.C2344m;
import androidx.compose.ui.text.input.C2348q;
import androidx.compose.ui.text.input.InterfaceC2340i;
import androidx.compose.ui.text.input.TextFieldValue;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n1#1,570:1\n109#1,5:571\n109#1,5:576\n109#1,5:581\n109#1,5:586\n109#1,5:591\n109#1,5:596\n109#1,5:601\n109#1,5:606\n109#1,5:611\n109#1,5:616\n109#1,5:621\n109#1,5:626\n109#1,5:631\n109#1,5:636\n109#1,5:641\n109#1,5:646\n109#1,5:651\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n166#1:571,5\n201#1:576,5\n206#1:581,5\n212#1:586,5\n220#1:591,5\n231#1:596,5\n237#1:601,5\n243#1:606,5\n249#1:611,5\n284#1:616,5\n367#1:621,5\n393#1:626,5\n451#1:631,5\n461#1:636,5\n473#1:641,5\n493#1:646,5\n502#1:651,5\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class RecordingInputConnection implements InputConnection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f93794l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F0 f93795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final LegacyTextFieldState f93797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextFieldSelectionManager f93798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final G1 f93799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f93800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public TextFieldValue f93801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f93802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f93803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC2340i> f93804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93805k;

    public RecordingInputConnection(@NotNull TextFieldValue textFieldValue, @NotNull F0 f02, boolean z10, @Nullable LegacyTextFieldState legacyTextFieldState, @Nullable TextFieldSelectionManager textFieldSelectionManager, @Nullable G1 g12) {
        this.f93795a = f02;
        this.f93796b = z10;
        this.f93797c = legacyTextFieldState;
        this.f93798d = textFieldSelectionManager;
        this.f93799e = g12;
        this.f93801g = textFieldValue;
        this.f93804j = new ArrayList();
        this.f93805k = true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f93805k;
        if (!z10) {
            return z10;
        }
        d();
        return true;
    }

    public final void c(InterfaceC2340i interfaceC2340i) {
        d();
        try {
            this.f93804j.add(interfaceC2340i);
        } finally {
            e();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f93805k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f93804j.clear();
        this.f93800f = 0;
        this.f93805k = false;
        this.f93795a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z10 = this.f93805k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        boolean z10 = this.f93805k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z10 = this.f93805k;
        return z10 ? this.f93796b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f93805k;
        if (z10) {
            c(new C2333b(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final boolean d() {
        this.f93800f++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f93805k;
        if (!z10) {
            return z10;
        }
        c(new C2338g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f93805k;
        if (!z10) {
            return z10;
        }
        c(new C2339h(i10, i11));
        return true;
    }

    public final boolean e() {
        int i10 = this.f93800f - 1;
        this.f93800f = i10;
        if (i10 == 0 && !this.f93804j.isEmpty()) {
            this.f93795a.b(kotlin.collections.U.d6(this.f93804j));
            this.f93804j.clear();
        }
        return this.f93800f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }

    public final boolean f(InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        boolean z10 = this.f93805k;
        if (z10) {
            interfaceC4376a.invoke();
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f93805k;
        if (!z10) {
            return z10;
        }
        c(new C2344m());
        return true;
    }

    public final boolean g() {
        return this.f93796b;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        TextFieldValue textFieldValue = this.f93801g;
        return TextUtils.getCapsMode(textFieldValue.f104741a.f104196a, androidx.compose.ui.text.Z.l(textFieldValue.f104742b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f93803i = z10;
        if (z10) {
            this.f93802h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return U0.b(this.f93801g);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i10) {
        if (androidx.compose.ui.text.Z.h(this.f93801g.f104742b)) {
            return null;
        }
        return androidx.compose.ui.text.input.X.a(this.f93801g).f104196a;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return androidx.compose.ui.text.input.X.b(this.f93801g, i10).f104196a;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return androidx.compose.ui.text.input.X.c(this.f93801g, i10).f104196a;
    }

    @NotNull
    public final F0 h() {
        return this.f93795a;
    }

    @Nullable
    public final LegacyTextFieldState i() {
        return this.f93797c;
    }

    @Nullable
    public final TextFieldSelectionManager j() {
        return this.f93798d;
    }

    @NotNull
    public final TextFieldValue k() {
        return this.f93801g;
    }

    @Nullable
    public final G1 l() {
        return this.f93799e;
    }

    public final void m(String str) {
    }

    public final void n(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    public final void o(@NotNull TextFieldValue textFieldValue) {
        this.f93801g = textFieldValue;
    }

    public final void p(@NotNull TextFieldValue textFieldValue, @NotNull G0 g02) {
        if (this.f93805k) {
            this.f93801g = textFieldValue;
            if (this.f93803i) {
                g02.e(this.f93802h, U0.b(textFieldValue));
            }
            androidx.compose.ui.text.Z z10 = textFieldValue.f104743c;
            int iL = z10 != null ? androidx.compose.ui.text.Z.l(z10.f104408a) : -1;
            androidx.compose.ui.text.Z z11 = textFieldValue.f104743c;
            g02.a(androidx.compose.ui.text.Z.l(textFieldValue.f104742b), androidx.compose.ui.text.Z.k(textFieldValue.f104742b), iL, z11 != null ? androidx.compose.ui.text.Z.k(z11.f104408a) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f93805k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    c(new androidx.compose.ui.text.input.W(0, this.f93801g.f104741a.f104196a.length()));
                    break;
                case R.id.cut:
                    n(277);
                    break;
                case R.id.copy:
                    n(278);
                    break;
                case R.id.paste:
                    n(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f93805k;
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
        this.f93795a.a(i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C1784h.f94101a.b(this.f93797c, this.f93798d, handwritingGesture, this.f93799e, executor, intConsumer, new ed.l<InterfaceC2340i, kotlin.L0>() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection.performHandwritingGesture.1
                {
                    super(1);
                }

                public final void e(@NotNull InterfaceC2340i interfaceC2340i) {
                    RecordingInputConnection.this.c(interfaceC2340i);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC2340i interfaceC2340i) {
                    e(interfaceC2340i);
                    return kotlin.L0.f217464a;
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z10 = this.f93805k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1784h.f94101a.d(this.f93797c, this.f93798d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
        boolean z14 = this.f93805k;
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
        this.f93795a.d(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean z10 = this.f93805k;
        if (!z10) {
            return z10;
        }
        this.f93795a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f93805k;
        if (z10) {
            c(new androidx.compose.ui.text.input.U(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f93805k;
        if (z10) {
            c(new androidx.compose.ui.text.input.V(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f93805k;
        if (!z10) {
            return z10;
        }
        c(new androidx.compose.ui.text.input.W(i10, i11));
        return true;
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, F0 f02, boolean z10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, G1 g12, int i10, C4969v c4969v) {
        this(textFieldValue, f02, z10, (i10 & 8) != 0 ? null : legacyTextFieldState, (i10 & 16) != 0 ? null : textFieldSelectionManager, (i10 & 32) != 0 ? null : g12);
    }
}
