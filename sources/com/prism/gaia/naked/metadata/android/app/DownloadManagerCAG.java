package com.prism.gaia.naked.metadata.android.app;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.DownloadManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class DownloadManagerCAG {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static Impl_N f165295N = new Impl_N();

    public static final class Impl_N implements DownloadManagerCAGI.N {
        public Impl_QueryN QueryN = new Impl_QueryN();

        @W6.l
        public static final class Impl_QueryN implements DownloadManagerCAGI.N.QueryN {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.DownloadManager$Query");
            private InitOnce<NakedObject<long[]>> __mIds = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.m2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165510a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Integer>> __mStatusFlags = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.n2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165515a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<String>> __mOrderByColumn = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.o2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165520a.lambda$new$2();
                }
            });
            private InitOnce<NakedInt> __mOrderDirection = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.p2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165525a.lambda$new$3();
                }
            });
            private InitOnce<NakedBoolean> __mOnlyIncludeVisibleInDownloadsUi = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.q2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165530a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mIds");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mStatusFlags");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mOrderByColumn");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$3() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mOrderDirection");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mOnlyIncludeVisibleInDownloadsUi");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.DownloadManagerCAGI.N.QueryN
            public NakedObject<long[]> mIds() {
                return this.__mIds.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.DownloadManagerCAGI.N.QueryN
            public NakedBoolean mOnlyIncludeVisibleInDownloadsUi() {
                return this.__mOnlyIncludeVisibleInDownloadsUi.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.DownloadManagerCAGI.N.QueryN
            public NakedObject<String> mOrderByColumn() {
                return this.__mOrderByColumn.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.DownloadManagerCAGI.N.QueryN
            public NakedInt mOrderDirection() {
                return this.__mOrderDirection.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.DownloadManagerCAGI.N.QueryN
            public NakedObject<Integer> mStatusFlags() {
                return this.__mStatusFlags.get();
            }
        }
    }
}
