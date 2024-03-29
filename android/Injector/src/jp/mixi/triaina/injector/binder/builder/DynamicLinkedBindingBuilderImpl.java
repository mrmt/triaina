package jp.mixi.triaina.injector.binder.builder;

import jp.mixi.triaina.injector.binder.BinderContainer;
import jp.mixi.triaina.injector.binder.DynamicBinder;

public class DynamicLinkedBindingBuilderImpl<T> implements
		DynamicLinkedBindingBuilder<T> {
	private DynamicBinder mBinder;
	
	public DynamicLinkedBindingBuilderImpl(DynamicBinder binder) {
		mBinder = binder;
	}
		
	@Override
	public void to(Class<? extends T> implementation) {
		mBinder.to(implementation);
		BinderContainer.put(mBinder);
	}
}
