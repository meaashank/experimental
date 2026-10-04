package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes5.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f155731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SubscriberMethod f155732b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f155731a = obj;
        this.f155732b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f155731a == subscription.f155731a && this.f155732b.equals(subscription.f155732b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f155732b.f155728d.hashCode() + this.f155731a.hashCode();
    }
}
