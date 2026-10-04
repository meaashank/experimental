package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class KeyMappingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InterfaceC1821j f93309a = new b(new a(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
        @Nullable
        public Object get(@Nullable Object obj) {
            return Boolean.valueOf(((androidx.compose.ui.input.key.c) obj).f102100a.isCtrlPressed());
        }
    }));

    public static final class a implements InterfaceC1821j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<androidx.compose.ui.input.key.c, Boolean> f93310a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.l<? super androidx.compose.ui.input.key.c, Boolean> lVar) {
            this.f93310a = lVar;
        }

        @Override // androidx.compose.foundation.text.InterfaceC1821j
        @Nullable
        public KeyCommand a(@NotNull KeyEvent keyEvent) {
            boolean zE4;
            if (this.f93310a.invoke(new androidx.compose.ui.input.key.c(keyEvent)).booleanValue() && keyEvent.isShiftPressed()) {
                long jA = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA, r.f94606h)) {
                    return KeyCommand.REDO;
                }
                return null;
            }
            if (this.f93310a.invoke(new androidx.compose.ui.input.key.c(keyEvent)).booleanValue()) {
                long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
                r rVar = r.f94599a;
                rVar.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94601c)) {
                    zE4 = true;
                } else {
                    rVar.getClass();
                    zE4 = androidx.compose.ui.input.key.b.E4(jA2, r.f94616r);
                }
                if (zE4) {
                    return KeyCommand.COPY;
                }
                rVar.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94603e)) {
                    return KeyCommand.PASTE;
                }
                rVar.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94605g)) {
                    return KeyCommand.CUT;
                }
                rVar.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94600b)) {
                    return KeyCommand.SELECT_ALL;
                }
                rVar.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94604f)) {
                    return KeyCommand.REDO;
                }
                rVar.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94606h)) {
                    return KeyCommand.UNDO;
                }
                return null;
            }
            if (keyEvent.isCtrlPressed()) {
                return null;
            }
            if (keyEvent.isShiftPressed()) {
                long jA3 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r rVar2 = r.f94599a;
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94608j)) {
                    return KeyCommand.SELECT_LEFT_CHAR;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94609k)) {
                    return KeyCommand.SELECT_RIGHT_CHAR;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94610l)) {
                    return KeyCommand.SELECT_UP;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94611m)) {
                    return KeyCommand.SELECT_DOWN;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94612n)) {
                    return KeyCommand.SELECT_PAGE_UP;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94613o)) {
                    return KeyCommand.SELECT_PAGE_DOWN;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94614p)) {
                    return KeyCommand.SELECT_LINE_START;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94615q)) {
                    return KeyCommand.SELECT_LINE_END;
                }
                rVar2.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94616r)) {
                    return KeyCommand.PASTE;
                }
                return null;
            }
            long jA4 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
            r rVar3 = r.f94599a;
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94608j)) {
                return KeyCommand.LEFT_CHAR;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94609k)) {
                return KeyCommand.RIGHT_CHAR;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94610l)) {
                return KeyCommand.UP;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94611m)) {
                return KeyCommand.DOWN;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94612n)) {
                return KeyCommand.PAGE_UP;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94613o)) {
                return KeyCommand.PAGE_DOWN;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94614p)) {
                return KeyCommand.LINE_START;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94615q)) {
                return KeyCommand.LINE_END;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94617s)) {
                return KeyCommand.NEW_LINE;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94618t)) {
                return KeyCommand.DELETE_PREV_CHAR;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94619u)) {
                return KeyCommand.DELETE_NEXT_CHAR;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94620v)) {
                return KeyCommand.PASTE;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94621w)) {
                return KeyCommand.CUT;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94622x)) {
                return KeyCommand.COPY;
            }
            rVar3.getClass();
            if (androidx.compose.ui.input.key.b.E4(jA4, r.f94623y)) {
                return KeyCommand.TAB;
            }
            return null;
        }
    }

    public static final class b implements InterfaceC1821j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1821j f93311a;

        public b(InterfaceC1821j interfaceC1821j) {
            this.f93311a = interfaceC1821j;
        }

        @Override // androidx.compose.foundation.text.InterfaceC1821j
        @Nullable
        public KeyCommand a(@NotNull KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jA = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA, r.f94608j)) {
                    keyCommand = KeyCommand.SELECT_LEFT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA, r.f94609k)) {
                    keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA, r.f94610l)) {
                    keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(jA, r.f94611m)) {
                    keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jA2 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94608j)) {
                    keyCommand = KeyCommand.LEFT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94609k)) {
                    keyCommand = KeyCommand.RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94610l)) {
                    keyCommand = KeyCommand.PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94611m)) {
                    keyCommand = KeyCommand.NEXT_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94602d)) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94619u)) {
                    keyCommand = KeyCommand.DELETE_NEXT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94618t)) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94607i)) {
                    keyCommand = KeyCommand.DESELECT;
                }
            } else if (keyEvent.isShiftPressed()) {
                long jA3 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA3, r.f94614p)) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(jA3, r.f94615q)) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA4 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA4, r.f94618t)) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                } else if (androidx.compose.ui.input.key.b.E4(jA4, r.f94619u)) {
                    keyCommand = KeyCommand.DELETE_TO_LINE_END;
                }
            }
            return keyCommand == null ? this.f93311a.a(keyEvent) : keyCommand;
        }
    }

    @NotNull
    public static final InterfaceC1821j a(@NotNull ed.l<? super androidx.compose.ui.input.key.c, Boolean> lVar) {
        return new a(lVar);
    }

    @NotNull
    public static final InterfaceC1821j b() {
        return f93309a;
    }
}
