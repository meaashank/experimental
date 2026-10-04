package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z10) {
            this.isComplete = z10;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    void b(e eVar);

    boolean c(e eVar);

    boolean d(e eVar);

    RequestCoordinator getRoot();

    void h(e eVar);

    boolean j(e eVar);
}
