package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class FunctionStack {
    private Function[] data = new Function[8];
    private int size = 0;

    public void clear() {
        this.size = 0;
    }

    public Function pop() {
        Function[] functionArr = this.data;
        int i10 = this.size - 1;
        this.size = i10;
        return functionArr[i10];
    }

    public void push(Function function) {
        int i10 = this.size;
        Function[] functionArr = this.data;
        if (i10 >= functionArr.length) {
            Function[] functionArr2 = new Function[functionArr.length << 1];
            System.arraycopy(functionArr, 0, functionArr2, 0, functionArr.length);
            this.data = functionArr2;
        }
        Function[] functionArr3 = this.data;
        int i11 = this.size;
        this.size = i11 + 1;
        functionArr3[i11] = function;
    }

    public Function[] toArray() {
        int i10 = this.size;
        Function[] functionArr = new Function[i10];
        System.arraycopy(this.data, 0, functionArr, 0, i10);
        return functionArr;
    }
}
