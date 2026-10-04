package ac;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: renamed from: ac.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C1468a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Nb.a f84822b;

    public C1468a(String str, Nb.a aVar) {
        this.f84821a = str;
        this.f84822b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f84822b.a(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f84822b.b(this.f84821a, queryInfo.getQuery(), queryInfo);
    }
}
