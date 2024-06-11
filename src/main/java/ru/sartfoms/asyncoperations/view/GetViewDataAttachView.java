package ru.sartfoms.asyncoperations.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
public class GetViewDataAttachView extends VerticalLayout {
	private static final long serialVersionUID = 1L;
	GetViewDataAttachForm form = new GetViewDataAttachForm();

	public GetViewDataAttachView() {
		add(new H3("Запрашивает сведения о прикреплениях ЗЛ к МО на первое число месяца"), getContent());
	}

	private Component getContent() {
		HorizontalLayout content = new HorizontalLayout(form);
//		content.setFlexGrow(1, form);
//		content.setSizeFull();
		return content;
	}

}
