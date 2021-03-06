package br.com.ita.bdic3.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ita.bdic3.service.ContestacaoService;
import br.com.ita.bdic3.vo.ContestacaoVO;

@Controller
@RequestMapping()
public class MapaViewController {

	private static final String VIEW_MAPA_HIST = "redirect:/mapa-hist/index.html";
	private static final String VIEW_MAPA_REALTIME = "redirect:/mapa-realtime/index.html";


	@RequestMapping(value = "/mapaHistorico", method = RequestMethod.GET)
	public String mapaHistorico(Model model) {
		return VIEW_MAPA_HIST;		
	}
	
	@RequestMapping(value = "/mapaRealtime", method = RequestMethod.GET)
	public String mapaRealtime(Model model) {
		return VIEW_MAPA_REALTIME;		
	}

	/*@RequestMapping(method = RequestMethod.POST)
	public String validarCliente(@ModelAttribute("contestacaoVO") ContestacaoVO contestacaoVO, Model model) {
		if (contestacaoService.validarCliente(contestacaoVO)) {
			return VIEW_CONTESTACAO_FRAUDE;
		} else {
			model.addAttribute("mensagemErro", "Dados Invalidos");
			return VIEW_CONTESTACAO;
		}
	}*/

	// @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	// public String products(@PathVariable("id") String id, Model model) {
	// Produto produto = produtoService.findById(Long.parseLong(id));
	// model.addAttribute("pedidoVO", new PedidoVO());
	// model.addAttribute("produto", produto);
	// return VIEW_COMPRA;
	// }

}