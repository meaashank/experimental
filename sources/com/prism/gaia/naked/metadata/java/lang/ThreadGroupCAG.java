package com.prism.gaia.naked.metadata.java.lang;

import W6.c;
import W6.l;
import androidx.constraintlayout.widget.d;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ThreadGroupCAG {
    public static Impl__M23 _M23 = new Impl__M23();
    public static Impl_N24 N24 = new Impl_N24();

    @l
    public static final class Impl_N24 implements ThreadGroupCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ThreadGroup.class);
        private InitOnce<NakedObject<Integer>> __ngroups = new InitOnce<>(new InitOnce.Init() { // from class: B9.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17449a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<ThreadGroup[]>> __groups = new InitOnce<>(new InitOnce.Init() { // from class: B9.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17450a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<ThreadGroup>> __parent = new InitOnce<>(new InitOnce.Init() { // from class: B9.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17451a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<Thread[]>> __threads = new InitOnce<>(new InitOnce.Init() { // from class: B9.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17452a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "ngroups");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "groups");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), d.f107893V1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "threads");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI.N24
        public NakedObject<ThreadGroup[]> groups() {
            return this.__groups.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI.N24
        public NakedObject<Integer> ngroups() {
            return this.__ngroups.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI.N24
        public NakedObject<ThreadGroup> parent() {
            return this.__parent.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI.N24
        public NakedObject<Thread[]> threads() {
            return this.__threads.get();
        }
    }

    @l
    public static final class Impl__M23 implements ThreadGroupCAGI._M23 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ThreadGroup.class);
        private InitOnce<NakedObject<List<ThreadGroup>>> __groups = new InitOnce<>(new InitOnce.Init() { // from class: B9.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17453a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<ThreadGroup>> __parent = new InitOnce<>(new InitOnce.Init() { // from class: B9.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17454a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "groups");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), d.f107893V1);
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI._M23
        public NakedObject<List<ThreadGroup>> groups() {
            return this.__groups.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAGI._M23
        public NakedObject<ThreadGroup> parent() {
            return this.__parent.get();
        }
    }
}
