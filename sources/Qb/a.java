package Qb;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes7.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Nb.a f67669b;

    public a(String str, Nb.a aVar) {
        this.f67668a = str;
        this.f67669b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f67669b.a(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f67669b.b(this.f67668a, queryInfo.getQuery(), queryInfo);
    }
}
