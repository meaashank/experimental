package androidx.navigation;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f115165b;

    public /* synthetic */ O(int i10, Bundle bundle) {
        this.f115164a = i10;
        this.f115165b = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Navigation.h(this.f115164a, this.f115165b, view);
    }
}
