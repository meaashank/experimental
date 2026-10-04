package Wb;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes7.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f76679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Nb.a f76680b;

    public a(String str, Nb.a aVar) {
        this.f76679a = str;
        this.f76680b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f76680b.a(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f76680b.b(this.f76679a, queryInfo.getQuery(), queryInfo);
    }
}
