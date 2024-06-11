package ru.sartfoms.asyncoperations.view;

import java.util.List;
import java.util.Locale;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class GetViewDataAttachForm extends HorizontalLayout {
	private static final long serialVersionUID = 1L;
	Locale russianLocale = new Locale("rus", "RU");
	DatePicker datePicker = new DatePicker("Первое число месяца");
	DatePicker.DatePickerI18n russianI18n = new DatePicker.DatePickerI18n();
	Button startBtn = new Button("Пуск");

	public GetViewDataAttachForm() {
		russianI18n.setMonthNames(List.of("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
				"Сентябрь", "Октябрь", "Ноябрь", "Декабрь"));
		russianI18n.setWeekdays(
				List.of("Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"));
		russianI18n.setWeekdaysShort(List.of("Вс", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб"));
		russianI18n.setToday("Сегодня");
		russianI18n.setCancel("Отмена");

		datePicker.setI18n(russianI18n);
		datePicker.setLocale(russianLocale);

		startBtn.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

		add(datePicker, startBtn);

		setAlignItems(FlexComponent.Alignment.END);
	}
}
