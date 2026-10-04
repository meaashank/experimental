package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.C1989d;
import androidx.compose.ui.focus.C1997l;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.focus.M;
import androidx.compose.ui.focus.t;
import androidx.compose.ui.focus.v;
import androidx.compose.ui.focus.x;
import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.p;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,240:1\n1#2:241\n1#2:325\n96#3:242\n240#4:243\n193#4,12:244\n205#4,6:263\n241#4:269\n432#4,6:270\n442#4,2:277\n444#4,8:282\n452#4,9:293\n461#4,8:305\n242#4:313\n212#4,3:314\n197#4:317\n42#5,7:256\n249#6:276\n245#7,3:279\n248#7,3:302\n1208#8:290\n1187#8,2:291\n40#9,7:318\n47#9,4:328\n728#10,2:326\n*S KotlinDebug\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n*L\n151#1:325\n125#1:242\n125#1:243\n125#1:244,12\n125#1:263,6\n125#1:269\n125#1:270,6\n125#1:277,2\n125#1:282,8\n125#1:293,9\n125#1:305,8\n125#1:313\n125#1:314,3\n125#1:317\n125#1:256,7\n125#1:276\n125#1:279,3\n125#1:302,3\n125#1:290\n125#1:291,2\n151#1:318,7\n151#1:328,4\n151#1:326,2\n*E\n"})
public final class FocusGroupPropertiesNode extends p.d implements x, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public View f105591o;

    @Override // androidx.compose.ui.p.d
    public void O2() {
        d.g(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        d.g(this).removeOnAttachStateChangeListener(this);
        this.f105591o = null;
    }

    @Override // androidx.compose.ui.focus.x
    public void Z1(@NotNull v vVar) {
        vVar.j(false);
        vVar.e(new FocusGroupPropertiesNode$applyFocusProperties$1(this));
        vVar.u(new FocusGroupPropertiesNode$applyFocusProperties$2(this));
    }

    public final FocusTargetNode e3() {
        p.d dVar = this.f103115a;
        if (!dVar.f103127m) {
            W.a.g("visitLocalDescendants called on an unattached node");
            throw null;
        }
        if ((dVar.f103118d & 1024) != 0) {
            boolean z10 = false;
            for (p.d dVar2 = dVar.f103120f; dVar2 != null; dVar2 = dVar2.f103120f) {
                if ((dVar2.f103117c & 1024) != 0) {
                    p.d dVarL = dVar2;
                    androidx.compose.runtime.collection.c cVar = null;
                    while (dVarL != null) {
                        if (dVarL instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) dVarL;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((dVarL.f103117c & 1024) != 0 && (dVarL instanceof AbstractC2206j)) {
                            int i10 = 0;
                            for (p.d dVar3 = ((AbstractC2206j) dVarL).f103066p; dVar3 != null; dVar3 = dVar3.f103120f) {
                                if ((dVar3.f103117c & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarL = dVar3;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                        }
                                        if (dVarL != null) {
                                            cVar.b(dVarL);
                                            dVarL = null;
                                        }
                                        cVar.b(dVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarL = C2204h.l(cVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Nullable
    public final View f3() {
        return this.f105591o;
    }

    @NotNull
    public final FocusRequester g3(int i10) {
        View viewG = d.g(this);
        if (viewG.isFocused() || viewG.hasFocus()) {
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100593d;
        }
        if (C1997l.b(viewG, C1997l.c(i10), d.f(C2204h.s(this).G(), (View) C2204h.s(this), viewG))) {
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100593d;
        }
        FocusRequester.f100591b.getClass();
        return FocusRequester.f100594e;
    }

    @NotNull
    public final FocusRequester h3(int i10) {
        View viewG = d.g(this);
        if (!viewG.hasFocus()) {
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100593d;
        }
        t tVarG = C2204h.s(this).G();
        View view = (View) C2204h.s(this);
        if (!(viewG instanceof ViewGroup)) {
            if (!view.requestFocus()) {
                throw new IllegalStateException("host view did not take focus");
            }
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100593d;
        }
        Rect rectF = d.f(tVarG, view, viewG);
        Integer numC = C1997l.c(i10);
        int iIntValue = numC != null ? numC.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view2 = this.f105591o;
        View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, rectF, iIntValue);
        if (viewFindNextFocus != null && d.d(viewG, viewFindNextFocus)) {
            viewFindNextFocus.requestFocus(iIntValue, rectF);
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100594e;
        }
        if (!view.requestFocus()) {
            throw new IllegalStateException("host view did not take focus");
        }
        FocusRequester.f100591b.getClass();
        return FocusRequester.f100593d;
    }

    public final void i3(@Nullable View view) {
        this.f105591o = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (C2204h.r(this).f102750k == null) {
            return;
        }
        View viewG = d.g(this);
        t tVarG = C2204h.s(this).G();
        l0 l0VarS = C2204h.s(this);
        boolean z10 = (view == null || view.equals(l0VarS) || !d.d(viewG, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(l0VarS) || !d.d(viewG, view2)) ? false : true;
        if (z10 && z11) {
            this.f105591o = view2;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.f105591o = null;
                return;
            }
            this.f105591o = null;
            if (e3().y1().isFocused()) {
                C1989d.f100651b.getClass();
                tVarG.f(false, true, false, C1989d.f100659j);
                return;
            }
            return;
        }
        this.f105591o = view2;
        FocusTargetNode focusTargetNodeE3 = e3();
        if (focusTargetNodeE3.y1().getHasFocus()) {
            return;
        }
        M mC = tVarG.c();
        try {
            if (mC.f100631c) {
                mC.g();
            }
            mC.f100631c = true;
            FocusTransactionsKt.l(focusTargetNodeE3);
            mC.h();
        } catch (Throwable th) {
            mC.h();
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
