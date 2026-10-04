package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.input.C2333b;
import androidx.compose.ui.text.input.C2338g;
import androidx.compose.ui.text.input.C2344m;
import androidx.compose.ui.text.input.C2348q;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.InterfaceC2340i;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.Ref;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class TextFieldKeyInput {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f93426m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LegacyTextFieldState f93427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextFieldSelectionManager f93428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextFieldValue f93429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f93430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f93431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.text.selection.C f93432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.input.L f93433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Q f93434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C1756c f93435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterfaceC1821j f93436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ed.l<TextFieldValue, L0> f93437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f93438l;

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, androidx.compose.foundation.text.selection.C c10, androidx.compose.ui.text.input.L l10, Q q10, C1756c c1756c, InterfaceC1821j interfaceC1821j, ed.l lVar, int i10, C4969v c4969v) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z10, z11, c10, l10, q10, c1756c, interfaceC1821j, lVar, i10);
    }

    public final void e(InterfaceC2340i interfaceC2340i) {
        f(kotlin.collections.H.l(interfaceC2340i));
    }

    public final void f(List<? extends InterfaceC2340i> list) {
        EditProcessor editProcessor = this.f93427a.f93321d;
        List<? extends InterfaceC2340i> listD6 = kotlin.collections.U.d6(list);
        ((ArrayList) listD6).add(0, new C2344m());
        this.f93437k.invoke(editProcessor.b(listD6));
    }

    public final void g(ed.l<? super androidx.compose.foundation.text.selection.A, L0> lVar) {
        androidx.compose.foundation.text.selection.A a10 = new androidx.compose.foundation.text.selection.A(this.f93429c, this.f93433g, this.f93427a.j(), this.f93432f);
        lVar.invoke(a10);
        if (Z.g(a10.f94968f, this.f93429c.f104742b) && kotlin.jvm.internal.G.g(a10.f94969g, this.f93429c.f104741a)) {
            return;
        }
        this.f93437k.invoke(a10.i0());
    }

    public final boolean h() {
        return this.f93430d;
    }

    @NotNull
    public final androidx.compose.ui.text.input.L i() {
        return this.f93433g;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.C j() {
        return this.f93432f;
    }

    @NotNull
    public final TextFieldSelectionManager k() {
        return this.f93428b;
    }

    public final boolean l() {
        return this.f93431e;
    }

    @NotNull
    public final LegacyTextFieldState m() {
        return this.f93427a;
    }

    @Nullable
    public final Q n() {
        return this.f93434h;
    }

    @NotNull
    public final TextFieldValue o() {
        return this.f93429c;
    }

    public final boolean p(@NotNull KeyEvent keyEvent) {
        final KeyCommand keyCommandA;
        C2333b c2333bQ = q(keyEvent);
        if (c2333bQ != null) {
            if (!this.f93430d) {
                return false;
            }
            e(c2333bQ);
            this.f93432f.f94672a = null;
            return true;
        }
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        if (iB != androidx.compose.ui.input.key.d.f102104e || (keyCommandA = this.f93436j.a(keyEvent)) == null) {
            return false;
        }
        if (keyCommandA.getEditsText() && !this.f93430d) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f217897a = true;
        g(new ed.l<androidx.compose.foundation.text.selection.A, L0>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f93451a;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    try {
                        iArr[KeyCommand.COPY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KeyCommand.PASTE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[KeyCommand.CUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[KeyCommand.UP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[KeyCommand.DOWN.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[KeyCommand.HOME.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[KeyCommand.END.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[KeyCommand.TAB.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[KeyCommand.UNDO.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[KeyCommand.REDO.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    f93451a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull androidx.compose.foundation.text.selection.A a10) {
                TextFieldValue textFieldValueH;
                TextFieldValue textFieldValueD;
                switch (a.f93451a[keyCommandA.ordinal()]) {
                    case 1:
                        this.f93428b.p(false);
                        break;
                    case 2:
                        this.f93428b.W();
                        break;
                    case 3:
                        this.f93428b.t();
                        break;
                    case 4:
                        a10.d(new ed.l<androidx.compose.foundation.text.selection.A, L0>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            public final void e(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                a11.F();
                            }

                            @Override // ed.l
                            public L0 invoke(androidx.compose.foundation.text.selection.A a11) {
                                a11.F();
                                return L0.f217464a;
                            }
                        });
                        break;
                    case 5:
                        a10.e(new ed.l<androidx.compose.foundation.text.selection.A, L0>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            public final void e(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                a11.N();
                            }

                            @Override // ed.l
                            public L0 invoke(androidx.compose.foundation.text.selection.A a11) {
                                a11.N();
                                return L0.f217464a;
                            }
                        });
                        break;
                    case 6:
                        a10.G();
                        break;
                    case 7:
                        a10.O();
                        break;
                    case 8:
                        a10.L();
                        break;
                    case 9:
                        a10.I();
                        break;
                    case 10:
                        a10.V();
                        break;
                    case 11:
                        a10.E();
                        break;
                    case 12:
                        a10.l0();
                        break;
                    case 13:
                        a10.k0();
                        break;
                    case 14:
                        a10.U();
                        break;
                    case 15:
                        a10.R();
                        break;
                    case 16:
                        a10.S();
                        break;
                    case 17:
                        a10.T();
                        break;
                    case 18:
                        a10.Q();
                        break;
                    case 19:
                        a10.P();
                        break;
                    case 20:
                        List<InterfaceC2340i> listF0 = a10.f0(new ed.l<androidx.compose.foundation.text.selection.A, InterfaceC2340i>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // ed.l
                            @Nullable
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final InterfaceC2340i invoke(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                return new C2338g(Z.i(a11.f94968f) - a11.v(), 0);
                            }
                        });
                        if (listF0 != null) {
                            this.f(listF0);
                        }
                        break;
                    case 21:
                        List<InterfaceC2340i> listF02 = a10.f0(new ed.l<androidx.compose.foundation.text.selection.A, InterfaceC2340i>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // ed.l
                            @Nullable
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final InterfaceC2340i invoke(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                int iO = a11.o();
                                if (iO != -1) {
                                    return new C2338g(0, iO - ((int) (a11.f94968f & ZipKt.f225990j)));
                                }
                                return null;
                            }
                        });
                        if (listF02 != null) {
                            this.f(listF02);
                        }
                        break;
                    case 22:
                        List<InterfaceC2340i> listF03 = a10.f0(new ed.l<androidx.compose.foundation.text.selection.A, InterfaceC2340i>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // ed.l
                            @Nullable
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final InterfaceC2340i invoke(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                Integer numY = a11.y();
                                if (numY == null) {
                                    return null;
                                }
                                return new C2338g(Z.i(a11.f94968f) - numY.intValue(), 0);
                            }
                        });
                        if (listF03 != null) {
                            this.f(listF03);
                        }
                        break;
                    case 23:
                        List<InterfaceC2340i> listF04 = a10.f0(new ed.l<androidx.compose.foundation.text.selection.A, InterfaceC2340i>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // ed.l
                            @Nullable
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final InterfaceC2340i invoke(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                Integer numP = a11.p();
                                if (numP != null) {
                                    return new C2338g(0, numP.intValue() - Z.i(a11.f94968f));
                                }
                                return null;
                            }
                        });
                        if (listF04 != null) {
                            this.f(listF04);
                        }
                        break;
                    case 24:
                        List<InterfaceC2340i> listF05 = a10.f0(new ed.l<androidx.compose.foundation.text.selection.A, InterfaceC2340i>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // ed.l
                            @Nullable
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final InterfaceC2340i invoke(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                Integer numL = a11.l();
                                if (numL == null) {
                                    return null;
                                }
                                return new C2338g(Z.i(a11.f94968f) - numL.intValue(), 0);
                            }
                        });
                        if (listF05 != null) {
                            this.f(listF05);
                        }
                        break;
                    case 25:
                        List<InterfaceC2340i> listF06 = a10.f0(new ed.l<androidx.compose.foundation.text.selection.A, InterfaceC2340i>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // ed.l
                            @Nullable
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final InterfaceC2340i invoke(@NotNull androidx.compose.foundation.text.selection.A a11) {
                                Integer numI = a11.i();
                                if (numI != null) {
                                    return new C2338g(0, numI.intValue() - Z.i(a11.f94968f));
                                }
                                return null;
                            }
                        });
                        if (listF06 != null) {
                            this.f(listF06);
                        }
                        break;
                    case 26:
                        TextFieldKeyInput textFieldKeyInput = this;
                        if (!textFieldKeyInput.f93431e) {
                            textFieldKeyInput.e(new C2333b("\n", 1));
                        } else {
                            textFieldKeyInput.f93427a.f93338u.invoke(new C2348q(textFieldKeyInput.f93438l));
                        }
                        break;
                    case 27:
                        TextFieldKeyInput textFieldKeyInput2 = this;
                        if (!textFieldKeyInput2.f93431e) {
                            textFieldKeyInput2.e(new C2333b("\t", 1));
                        } else {
                            booleanRef.f217897a = false;
                        }
                        break;
                    case 28:
                        a10.W();
                        break;
                    case 29:
                        a10.F();
                        a10.X();
                        break;
                    case 30:
                        a10.N();
                        a10.X();
                        break;
                    case 31:
                        a10.G();
                        a10.X();
                        break;
                    case 32:
                        a10.O();
                        a10.X();
                        break;
                    case 33:
                        a10.L();
                        a10.X();
                        break;
                    case 34:
                        a10.I();
                        a10.X();
                        break;
                    case 35:
                        a10.U();
                        a10.X();
                        break;
                    case 36:
                        a10.R();
                        a10.X();
                        break;
                    case 37:
                        a10.S();
                        a10.X();
                        break;
                    case 38:
                        a10.T();
                        a10.X();
                        break;
                    case 39:
                        a10.V();
                        a10.X();
                        break;
                    case 40:
                        a10.E();
                        a10.X();
                        break;
                    case 41:
                        a10.l0();
                        a10.X();
                        break;
                    case 42:
                        a10.k0();
                        a10.X();
                        break;
                    case 43:
                        a10.Q();
                        a10.X();
                        break;
                    case 44:
                        a10.P();
                        a10.X();
                        break;
                    case 45:
                        a10.f();
                        break;
                    case 46:
                        Q q10 = this.f93434h;
                        if (q10 != null) {
                            q10.c(a10.i0());
                        }
                        Q q11 = this.f93434h;
                        if (q11 != null && (textFieldValueH = q11.h()) != null) {
                            this.f93437k.invoke(textFieldValueH);
                            break;
                        }
                        break;
                    case 47:
                        Q q12 = this.f93434h;
                        if (q12 != null && (textFieldValueD = q12.d()) != null) {
                            this.f93437k.invoke(textFieldValueD);
                            break;
                        }
                        break;
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.foundation.text.selection.A a10) {
                e(a10);
                return L0.f217464a;
            }
        });
        Q q10 = this.f93434h;
        if (q10 != null) {
            q10.f93391f = true;
        }
        return booleanRef.f217897a;
    }

    public final C2333b q(KeyEvent keyEvent) {
        Integer numA;
        if (D.a(keyEvent) && (numA = this.f93435i.a(keyEvent)) != null) {
            return new C2333b(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, androidx.compose.foundation.text.selection.C c10, androidx.compose.ui.text.input.L l10, Q q10, C1756c c1756c, InterfaceC1821j interfaceC1821j, ed.l<? super TextFieldValue, L0> lVar, int i10) {
        this.f93427a = legacyTextFieldState;
        this.f93428b = textFieldSelectionManager;
        this.f93429c = textFieldValue;
        this.f93430d = z10;
        this.f93431e = z11;
        this.f93432f = c10;
        this.f93433g = l10;
        this.f93434h = q10;
        this.f93435i = c1756c;
        this.f93436j = interfaceC1821j;
        this.f93437k = lVar;
        this.f93438l = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, androidx.compose.foundation.text.selection.C c10, androidx.compose.ui.text.input.L l10, Q q10, C1756c c1756c, InterfaceC1821j interfaceC1821j, ed.l lVar, int i10, int i11, C4969v c4969v) {
        androidx.compose.ui.text.input.L l11;
        TextFieldValue textFieldValue2 = (i11 & 4) != 0 ? new TextFieldValue((String) null, 0L, (Z) null, 7, (C4969v) null) : textFieldValue;
        boolean z12 = (i11 & 8) != 0 ? true : z10;
        boolean z13 = (i11 & 16) != 0 ? false : z11;
        if ((i11 & 64) != 0) {
            androidx.compose.ui.text.input.L.f104710a.getClass();
            l11 = L.a.f104712b;
        } else {
            l11 = l10;
        }
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue2, z12, z13, c10, l11, (i11 & 128) != 0 ? null : q10, c1756c, (i11 & 512) != 0 ? C1822k.f94400a : interfaceC1821j, (i11 & 1024) != 0 ? new ed.l<TextFieldValue, L0>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void e(@NotNull TextFieldValue textFieldValue3) {
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(TextFieldValue textFieldValue3) {
                return L0.f217464a;
            }
        } : lVar, i10);
    }
}
