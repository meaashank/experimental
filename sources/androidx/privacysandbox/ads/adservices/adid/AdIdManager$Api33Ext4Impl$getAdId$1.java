package androidx.privacysandbox.ads.adservices.adid;

import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", f = "AdIdManager.kt", i = {}, l = {62}, m = "getAdId", n = {}, s = {})
public final class AdIdManager$Api33Ext4Impl$getAdId$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f116015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdIdManager.Api33Ext4Impl f116017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManager$Api33Ext4Impl$getAdId$1(AdIdManager.Api33Ext4Impl api33Ext4Impl, kotlin.coroutines.e<? super AdIdManager$Api33Ext4Impl$getAdId$1> eVar) {
        super(eVar);
        this.f116017c = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f116016b = obj;
        this.f116018d |= Integer.MIN_VALUE;
        return this.f116017c.a(this);
    }
}
