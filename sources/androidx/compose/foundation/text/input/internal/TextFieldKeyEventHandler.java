package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.C1756c;
import androidx.compose.foundation.text.C1762i;
import androidx.compose.foundation.text.C1822k;
import androidx.compose.foundation.text.InterfaceC1821j;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.focus.InterfaceC1999n;
import androidx.compose.ui.layout.C2187w;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.platform.InterfaceC2285u1;
import ed.InterfaceC4376a;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n237#1,10:284\n247#1,5:435\n318#2,2:266\n323#2:283\n314#2,6:391\n323#2:412\n314#2,6:413\n323#2:434\n261#3,15:268\n261#3,15:397\n261#3,15:419\n115#4,8:294\n123#4,8:303\n115#4,16:311\n115#4,16:327\n115#4,16:343\n115#4,16:359\n115#4,16:375\n1#5:302\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n112#1:284,10\n112#1:435,5\n93#1:266,2\n93#1:283\n177#1:391,6\n177#1:412\n188#1:413,6\n188#1:434\n93#1:268,15\n177#1:397,15\n188#1:419,15\n134#1:294,8\n134#1:303,8\n144#1:311,16\n152#1:327,16\n158#1:343,16\n164#1:359,16\n170#1:375,16\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class TextFieldKeyEventHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f93983d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.text.input.internal.selection.g f93984a = new androidx.compose.foundation.text.input.internal.selection.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1756c f93985b = new C1756c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC1821j f93986c = C1822k.f94400a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93987a;

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
            f93987a = iArr;
        }
    }

    public final float a(TextLayoutState textLayoutState) {
        InterfaceC2188x interfaceC2188xK = textLayoutState.k();
        if (interfaceC2188xK == null) {
            return Float.NaN;
        }
        P.j jVarM = null;
        if (!interfaceC2188xK.H()) {
            interfaceC2188xK = null;
        }
        if (interfaceC2188xK == null) {
            return Float.NaN;
        }
        InterfaceC2188x interfaceC2188xE = textLayoutState.e();
        if (interfaceC2188xE != null) {
            if (!interfaceC2188xE.H()) {
                interfaceC2188xE = null;
            }
            if (interfaceC2188xE != null) {
                jVarM = C2187w.m(interfaceC2188xE, interfaceC2188xK, false, 2, null);
            }
        }
        if (jVarM != null) {
            return P.n.m(jVarM.z());
        }
        return Float.NaN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean b(@NotNull KeyEvent keyEvent, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, boolean z10, boolean z11, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        androidx.compose.ui.text.Z z12;
        Integer numA;
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        boolean z13 = false;
        if (iB == androidx.compose.ui.input.key.d.f102104e) {
            if (!androidx.compose.foundation.text.D.a(keyEvent) || (numA = this.f93985b.a(keyEvent)) == null) {
                KeyCommand keyCommandA = this.f93986c.a(keyEvent);
                if (keyCommandA != null && (!keyCommandA.getEditsText() || z10)) {
                    boolean zC = a1.c(keyEvent);
                    androidx.compose.foundation.text.input.internal.selection.f fVar = new androidx.compose.foundation.text.input.internal.selection.f(transformedTextFieldState, textLayoutState.f94004c.getValue(), zC, a(textLayoutState), this.f93984a);
                    switch (a.f93987a[keyCommandA.ordinal()]) {
                        case 1:
                            textFieldSelectionState.E(false);
                            z13 = true;
                            break;
                        case 2:
                            textFieldSelectionState.q0();
                            z13 = true;
                            break;
                        case 3:
                            textFieldSelectionState.H();
                            z13 = true;
                            break;
                        case 4:
                            fVar.h(new ed.l<androidx.compose.foundation.text.input.internal.selection.f, kotlin.L0>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$1
                                public final void e(@NotNull androidx.compose.foundation.text.input.internal.selection.f fVar2) {
                                    fVar2.G();
                                }

                                @Override // ed.l
                                public kotlin.L0 invoke(androidx.compose.foundation.text.input.internal.selection.f fVar2) {
                                    fVar2.G();
                                    return kotlin.L0.f217464a;
                                }
                            });
                            z13 = true;
                            break;
                        case 5:
                            fVar.i(new ed.l<androidx.compose.foundation.text.input.internal.selection.f, kotlin.L0>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$2
                                public final void e(@NotNull androidx.compose.foundation.text.input.internal.selection.f fVar2) {
                                    fVar2.O();
                                }

                                @Override // ed.l
                                public kotlin.L0 invoke(androidx.compose.foundation.text.input.internal.selection.f fVar2) {
                                    fVar2.O();
                                    return kotlin.L0.f217464a;
                                }
                            });
                            z13 = true;
                            break;
                        case 6:
                            fVar.H();
                            z13 = true;
                            break;
                        case 7:
                            fVar.P();
                            z13 = true;
                            break;
                        case 8:
                            fVar.M();
                            z13 = true;
                            break;
                        case 9:
                            fVar.J();
                            z13 = true;
                            break;
                        case 10:
                            fVar.W();
                            z13 = true;
                            break;
                        case 11:
                            fVar.E();
                            z13 = true;
                            break;
                        case 12:
                            fVar.X();
                            z13 = true;
                            break;
                        case 13:
                            fVar.F();
                            z13 = true;
                            break;
                        case 14:
                            fVar.V();
                            z13 = true;
                            break;
                        case 15:
                            fVar.S();
                            z13 = true;
                            break;
                        case 16:
                            fVar.T();
                            z13 = true;
                            break;
                        case 17:
                            fVar.U();
                            z13 = true;
                            break;
                        case 18:
                            fVar.R();
                            z13 = true;
                            break;
                        case 19:
                            fVar.Q();
                            z13 = true;
                            break;
                        case 20:
                            if (androidx.compose.ui.text.Z.h(fVar.f94344g)) {
                                int iW = fVar.w();
                                Integer numValueOf = Integer.valueOf(iW);
                                if (iW == -1) {
                                    numValueOf = null;
                                }
                                z12 = numValueOf != null ? new androidx.compose.ui.text.Z(androidx.compose.ui.text.a0.b(numValueOf.intValue(), (int) (fVar.f94344g & ZipKt.f225990j))) : null;
                                if (z12 != null) {
                                    TransformedTextFieldState.D(transformedTextFieldState, "", z12.f104408a, null, !zC, 4, null);
                                }
                            } else {
                                TransformedTextFieldState.D(transformedTextFieldState, "", fVar.f94344g, null, !zC, 4, null);
                            }
                            z13 = true;
                            break;
                        case 21:
                            if (androidx.compose.ui.text.Z.h(fVar.f94344g)) {
                                int iS = fVar.s();
                                Integer numValueOf2 = Integer.valueOf(iS);
                                if (iS == -1) {
                                    numValueOf2 = null;
                                }
                                z12 = numValueOf2 != null ? new androidx.compose.ui.text.Z(androidx.compose.ui.text.a0.b((int) (fVar.f94344g >> 32), numValueOf2.intValue())) : null;
                                if (z12 != null) {
                                    TransformedTextFieldState.D(transformedTextFieldState, "", z12.f104408a, null, !zC, 4, null);
                                }
                            } else {
                                TransformedTextFieldState.D(transformedTextFieldState, "", fVar.f94344g, null, !zC, 4, null);
                            }
                            z13 = true;
                            break;
                        case 22:
                            if (androidx.compose.ui.text.Z.h(fVar.f94344g)) {
                                TransformedTextFieldState.D(transformedTextFieldState, "", androidx.compose.ui.text.a0.b(fVar.z(), (int) (fVar.f94344g & ZipKt.f225990j)), null, !zC, 4, null);
                            } else {
                                TransformedTextFieldState.D(transformedTextFieldState, "", fVar.f94344g, null, !zC, 4, null);
                            }
                            z13 = true;
                            break;
                        case 23:
                            if (androidx.compose.ui.text.Z.h(fVar.f94344g)) {
                                TransformedTextFieldState.D(transformedTextFieldState, "", androidx.compose.ui.text.a0.b((int) (fVar.f94344g >> 32), fVar.t()), null, !zC, 4, null);
                            } else {
                                TransformedTextFieldState.D(transformedTextFieldState, "", fVar.f94344g, null, !zC, 4, null);
                            }
                            z13 = true;
                            break;
                        case 24:
                            if (androidx.compose.ui.text.Z.h(fVar.f94344g)) {
                                TransformedTextFieldState.D(transformedTextFieldState, "", androidx.compose.ui.text.a0.b(fVar.p(), (int) (fVar.f94344g & ZipKt.f225990j)), null, !zC, 4, null);
                            } else {
                                TransformedTextFieldState.D(transformedTextFieldState, "", fVar.f94344g, null, !zC, 4, null);
                            }
                            z13 = true;
                            break;
                        case 25:
                            if (androidx.compose.ui.text.Z.h(fVar.f94344g)) {
                                TransformedTextFieldState.D(transformedTextFieldState, "", androidx.compose.ui.text.a0.b((int) (fVar.f94344g >> 32), fVar.m()), null, !zC, 4, null);
                            } else {
                                TransformedTextFieldState.D(transformedTextFieldState, "", fVar.f94344g, null, !zC, 4, null);
                            }
                            z13 = true;
                            break;
                        case 26:
                            if (z11) {
                                interfaceC4376a.invoke();
                            } else {
                                androidx.compose.foundation.text.input.p pVar = transformedTextFieldState.f94013a;
                                androidx.compose.foundation.text.input.d dVar = transformedTextFieldState.f94014b;
                                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                                pVar.f94372b.f93722b.e();
                                I i10 = pVar.f94372b;
                                i10.c();
                                H.b(i10, "\n", 1);
                                pVar.e(dVar, true, textFieldEditUndoBehavior);
                            }
                            z13 = true;
                            break;
                        case 27:
                            if (!z11) {
                                androidx.compose.foundation.text.input.p pVar2 = transformedTextFieldState.f94013a;
                                androidx.compose.foundation.text.input.d dVar2 = transformedTextFieldState.f94014b;
                                TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.MergeIfPossible;
                                pVar2.f94372b.f93722b.e();
                                I i11 = pVar2.f94372b;
                                i11.c();
                                H.b(i11, "\t", 1);
                                pVar2.e(dVar2, true, textFieldEditUndoBehavior2);
                                z13 = true;
                            }
                            break;
                        case 28:
                            fVar.Y();
                            z13 = true;
                            break;
                        case 29:
                            fVar.G();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 30:
                            fVar.O();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 31:
                            fVar.H();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 32:
                            fVar.P();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 33:
                            fVar.M();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 34:
                            fVar.J();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 35:
                            fVar.V();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 36:
                            fVar.S();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 37:
                            fVar.T();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 38:
                            fVar.U();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 39:
                            fVar.W();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 40:
                            fVar.E();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 41:
                            fVar.X();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 42:
                            fVar.F();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 43:
                            fVar.R();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 44:
                            fVar.Q();
                            fVar.Z();
                            z13 = true;
                            break;
                        case 45:
                            fVar.k();
                            z13 = true;
                            break;
                        case 46:
                            transformedTextFieldState.I();
                            z13 = true;
                            break;
                        case 47:
                            transformedTextFieldState.y();
                            z13 = true;
                            break;
                        default:
                            z13 = true;
                            break;
                    }
                    if (!androidx.compose.ui.text.Z.g(fVar.f94344g, fVar.f94343f.f94359b)) {
                        transformedTextFieldState.F(fVar.f94344g);
                    }
                }
            } else {
                String string = new StringBuilder(2).appendCodePoint(numA.intValue()).toString();
                if (z10) {
                    boolean z14 = !a1.c(keyEvent);
                    androidx.compose.foundation.text.input.p pVar3 = transformedTextFieldState.f94013a;
                    androidx.compose.foundation.text.input.d dVar3 = transformedTextFieldState.f94014b;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = TextFieldEditUndoBehavior.MergeIfPossible;
                    pVar3.f94372b.f93722b.e();
                    I i12 = pVar3.f94372b;
                    i12.c();
                    H.b(i12, string, 1);
                    pVar3.e(dVar3, z14, textFieldEditUndoBehavior3);
                    this.f93984a.f94347a = Float.NaN;
                    return true;
                }
            }
        }
        return z13;
    }

    public boolean c(@NotNull KeyEvent keyEvent, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull InterfaceC1999n interfaceC1999n, @NotNull InterfaceC2285u1 interfaceC2285u1) {
        if (androidx.compose.ui.text.Z.h(transformedTextFieldState.p().f94359b) || !C1762i.a(keyEvent)) {
            return false;
        }
        textFieldSelectionState.I();
        return true;
    }

    public final void d(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, boolean z10, ed.l<? super androidx.compose.foundation.text.input.internal.selection.f, kotlin.L0> lVar) {
        androidx.compose.foundation.text.input.internal.selection.f fVar = new androidx.compose.foundation.text.input.internal.selection.f(transformedTextFieldState, textLayoutState.f94004c.getValue(), z10, a(textLayoutState), this.f93984a);
        lVar.invoke(fVar);
        if (androidx.compose.ui.text.Z.g(fVar.f94344g, fVar.f94343f.f94359b)) {
            return;
        }
        transformedTextFieldState.F(fVar.f94344g);
    }
}
