var gerenciadorPontoEletronicoModelModule = angular.module("gerenciadorPontoEletronicoModelModule", []);

gerenciadorPontoEletronicoModelModule.controller("gerenciadorPontoEletronicoModelController", function($scope, $http) {
	
	var NAME_API_PONTO_ELETRONICO = "http://localhost:8080/PLPOE-1.0.0.1-SNAPSHOT/rest/pontoEletronicoResource";
	
	var NAME_API_PONTO_ELETRONICO_FIND_ALL = "http://localhost:8080/PLPOE-1.0.0.1-SNAPSHOT/rest/pontoEletronicoResource/findAll";
	
	$scope.gerenciadorPontoEletronicoList = [];
	
	$scope.mesReferenciaList = [
		{ "mesReferencia": "Janeiro de 2019" },
		{ "mesReferencia": "Fevereiro de 2019" },
		{ "mesReferencia": "Março de 2019" },
		{ "mesReferencia": "Abril de 2019" },
		{ "mesReferencia": "Maio de 2019" },
		{ "mesReferencia": "Junho de 2019" },
		{ "mesReferencia": "Julho de 2019" },
		{ "mesReferencia": "Agosto de 2019" },
		{ "mesReferencia": "Setembro de 2019" },
		{ "mesReferencia": "Outubro de 2019" },
		{ "mesReferencia": "Novembro de 2019" },
		{ "mesReferencia": "Dezembro de 2019" },
	];
	
	$scope.gerenciadorPontoEletronicoModel = {
		dataHoradataHoraPrimeiraEntrada: null,
		dataHoradataHoraPrimeiraSaida: null,
		dataHoradataHoraSegundaEntrada: null,
		dataHoradataHoraSegundaSaida: null,
		dataHoraAtual: null,
		mesReferencia: null,
	};
	
	function incializador() {
		$scope.findAll();
//		$scope.findAllArquivoJson();
	};
	
	$scope.save = function(gerenciadorPontoEletronicoModel) {
		console.log(gerenciadorPontoEletronicoModel);
		gerenciadorPontoEletronicoModel.dataHoraAtual = $scope.recuperarDataAtualDDMMAAAA();
		$scope.gerenciadorPontoEletronicoList.push(gerenciadorPontoEletronicoModel);
		delete $scope.gerenciadorPontoEletronicoModel;
	};
	
	$scope.update = function(gerenciadorPontoEletronicoModel) {
		$scope.gerenciadorPontoEletronicoModel = gerenciadorPontoEletronicoModel;
	};
	
	$scope.remove = function(gerenciadorPontoEletronicoModel) {
		$scope.gerenciadorPontoEletronicoList.splice($scope.gerenciadorPontoEletronicoList.indexOf(gerenciadorPontoEletronicoModel), 1);
		$scope.clear();
	};
	
	$scope.findAll = function() {
		$http.get(NAME_API_PONTO_ELETRONICO_FIND_ALL).then(function(response) {
			$scope.gerenciadorPontoEletronicoList = response.data.gerenciadorPontoEletronicoModel;
		});
	};
	
	$scope.findAllArquivoJson = function() {
		$http.get("../module_gerenciador_ponto_eletronico/module_gerenciador_ponto_eletronico_view/gerenciador-ponto-eletronico-document.json").then(function(response) {
			$scope.gerenciadorPontoEletronicoList = response.data.gerenciadorPontoEletronicoModel;
		});
	};
	
	$scope.findOne = function(gerenciadorPontoEletronicoModel) {
		
	};
	
	$scope.recuperarDataAtualDDMMAAAA = function() {
		return new Date().getDate() + '/' + (new Date().getMonth()+1) + '/' + new Date().getFullYear();
	};
	
	$scope.recuperarDataAtualDDMMAAAAHHMM = function() {
		return new Date().getDate() + '/' + (new Date().getMonth()+1) + '/' + new Date().getFullYear() + ' ' + new Date().getHours() + ':' + new Date().getMinutes();
	};
	
	$scope.clear = function() {
		$scope.gerenciadorPontoEletronicoModel = null;
	};
	
	incializador();
	
});