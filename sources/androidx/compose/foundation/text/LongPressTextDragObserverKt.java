package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class LongPressTextDragObserverKt {
    @Nullable
    public static final Object c(@NotNull androidx.compose.ui.input.pointer.K k10, @NotNull A a10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objG = kotlinx.coroutines.M.g(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(k10, a10, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    @Nullable
    public static final Object d(@NotNull androidx.compose.ui.input.pointer.K k10, @NotNull final A a10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objP = DragGestureDetectorKt.p(k10, new ed.l<P.g, L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2
            {
                super(1);
            }

            public final void e(long j10) {
                a10.c(j10);
            }

            @Override // ed.l
            public /* synthetic */ L0 invoke(P.g gVar) {
                e(gVar.f65507a);
                return L0.f217464a;
            }
        }, new InterfaceC4376a<L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a10.onStop();
            }
        }, new InterfaceC4376a<L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a10.onCancel();
            }
        }, new ed.p<androidx.compose.ui.input.pointer.A, P.g, L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5
            {
                super(2);
            }

            public final void e(@NotNull androidx.compose.ui.input.pointer.A a11, long j10) {
                a10.b(j10);
            }

            @Override // ed.p
            public /* synthetic */ L0 invoke(androidx.compose.ui.input.pointer.A a11, P.g gVar) {
                e(a11, gVar.f65507a);
                return L0.f217464a;
            }
        }, eVar);
        return objP == CoroutineSingletons.COROUTINE_SUSPENDED ? objP : L0.f217464a;
    }

    public static final Object e(androidx.compose.ui.input.pointer.K k10, final A a10, kotlin.coroutines.e<? super L0> eVar) {
        Object objM = DragGestureDetectorKt.m(k10, new ed.l<P.g, L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
            {
                super(1);
            }

            public final void e(long j10) {
                a10.c(j10);
            }

            @Override // ed.l
            public /* synthetic */ L0 invoke(P.g gVar) {
                e(gVar.f65507a);
                return L0.f217464a;
            }
        }, new InterfaceC4376a<L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a10.onStop();
            }
        }, new InterfaceC4376a<L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a10.onCancel();
            }
        }, new ed.p<androidx.compose.ui.input.pointer.A, P.g, L0>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
            {
                super(2);
            }

            public final void e(@NotNull androidx.compose.ui.input.pointer.A a11, long j10) {
                a10.b(j10);
            }

            @Override // ed.p
            public /* synthetic */ L0 invoke(androidx.compose.ui.input.pointer.A a11, P.g gVar) {
                e(a11, gVar.f65507a);
                return L0.f217464a;
            }
        }, eVar);
        return objM == CoroutineSingletons.COROUTINE_SUSPENDED ? objM : L0.f217464a;
    }

    public static final Object f(androidx.compose.ui.input.pointer.K k10, A a10, kotlin.coroutines.e<? super L0> eVar) {
        Object objD = ForEachGestureKt.d(k10, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(a10, null), eVar);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : L0.f217464a;
    }
}
