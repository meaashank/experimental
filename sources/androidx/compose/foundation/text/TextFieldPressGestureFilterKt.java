package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.i;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.p;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @Nullable final androidx.compose.foundation.interaction.g gVar, boolean z10, @NotNull final ed.l<? super P.g, L0> lVar) {
        return z10 ? ComposedModifierKt.g(pVar, null, new ed.q<androidx.compose.ui.p, InterfaceC1946s, Integer, androidx.compose.ui.p>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @InterfaceC1917i
            @NotNull
            public final androidx.compose.ui.p e(@NotNull androidx.compose.ui.p pVar2, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                interfaceC1946s.y(-102778667);
                if (C1968u.c0()) {
                    C1968u.p0(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objA0 = interfaceC1946s.a0();
                InterfaceC1946s.f99968a.getClass();
                Object obj = InterfaceC1946s.a.f99970b;
                if (objA0 == obj) {
                    Object g10 = new androidx.compose.runtime.G(EffectsKt.m(EmptyCoroutineContext.f217673a, interfaceC1946s));
                    interfaceC1946s.S(g10);
                    objA0 = g10;
                }
                kotlinx.coroutines.L l10 = ((androidx.compose.runtime.G) objA0).f99123a;
                Object objA02 = interfaceC1946s.a0();
                if (objA02 == obj) {
                    objA02 = M1.g(null, null, 2, null);
                    interfaceC1946s.S(objA02);
                }
                final androidx.compose.runtime.L0 l02 = (androidx.compose.runtime.L0) objA02;
                X1 x1H = M1.h(lVar, interfaceC1946s, 0);
                Object obj2 = gVar;
                boolean zX = interfaceC1946s.x(obj2);
                final androidx.compose.foundation.interaction.g gVar2 = gVar;
                Object objA03 = interfaceC1946s.a0();
                if (zX || objA03 == obj) {
                    objA03 = new ed.l<androidx.compose.runtime.T, androidx.compose.runtime.S>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1

                        @kotlin.jvm.internal.V({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n1#1,490:1\n46#2,6:491\n*E\n"})
                        public static final class a implements androidx.compose.runtime.S {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ androidx.compose.runtime.L0 f93466a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ androidx.compose.foundation.interaction.g f93467b;

                            public a(androidx.compose.runtime.L0 l02, androidx.compose.foundation.interaction.g gVar) {
                                this.f93466a = l02;
                                this.f93467b = gVar;
                            }

                            @Override // androidx.compose.runtime.S
                            public void dispose() {
                                i.b bVar = (i.b) this.f93466a.getValue();
                                if (bVar != null) {
                                    i.a aVar = new i.a(bVar);
                                    androidx.compose.foundation.interaction.g gVar = this.f93467b;
                                    if (gVar != null) {
                                        gVar.a(aVar);
                                    }
                                    this.f93466a.setValue(null);
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // ed.l
                        @NotNull
                        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.runtime.S invoke(@NotNull androidx.compose.runtime.T t10) {
                            return new a(l02, gVar2);
                        }
                    };
                    interfaceC1946s.S(objA03);
                }
                EffectsKt.b(obj2, (ed.l) objA03, interfaceC1946s, 0);
                p.a aVar = androidx.compose.ui.p.f103112M2;
                androidx.compose.foundation.interaction.g gVar3 = gVar;
                boolean zC0 = interfaceC1946s.c0(l10) | interfaceC1946s.x(gVar) | interfaceC1946s.x(x1H);
                androidx.compose.foundation.interaction.g gVar4 = gVar;
                Object objA04 = interfaceC1946s.a0();
                if (zC0 || objA04 == obj) {
                    Object textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(l10, l02, gVar4, x1H, null);
                    interfaceC1946s.S(textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1);
                    objA04 = textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1;
                }
                androidx.compose.ui.p pVarE = androidx.compose.ui.input.pointer.T.e(aVar, gVar3, (ed.p) objA04);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
                interfaceC1946s.u();
                return pVarE;
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.p invoke(androidx.compose.ui.p pVar2, InterfaceC1946s interfaceC1946s, Integer num) {
                return e(pVar2, interfaceC1946s, num.intValue());
            }
        }, 1, null) : pVar;
    }

    public static /* synthetic */ androidx.compose.ui.p b(androidx.compose.ui.p pVar, androidx.compose.foundation.interaction.g gVar, boolean z10, ed.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(pVar, gVar, z10, lVar);
    }
}
