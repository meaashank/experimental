package Tb;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes7.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f68364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Nb.a f68365b;

    public a(String str, Nb.a aVar) {
        this.f68364a = str;
        this.f68365b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f68365b.a(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f68365b.b(this.f68364a, queryInfo.getQuery(), queryInfo);
    }
}
