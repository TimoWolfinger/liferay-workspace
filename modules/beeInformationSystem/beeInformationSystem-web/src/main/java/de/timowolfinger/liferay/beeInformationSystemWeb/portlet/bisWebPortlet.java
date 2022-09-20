package de.timowolfinger.liferay.beeInformationSystemWeb.portlet;

import de.timowolfinger.liferay.beeInformationSystemWeb.constants.bisWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author rustimo
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=" + bisWebPortletKeys.category,
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + bisWebPortletKeys.bisWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class bisWebPortlet extends MVCPortlet {
}