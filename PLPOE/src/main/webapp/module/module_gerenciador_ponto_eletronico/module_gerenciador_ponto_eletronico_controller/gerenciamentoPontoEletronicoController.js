var gerenciadorPontoEletronicoModelModule = angular.module("gerenciadorPontoEletronicoModelModule", []);

gerenciadorPontoEletronicoModelModule.controller("gerenciadorPontoEletronicoModelController", function($scope, $http) {
	
	var NAME_API_PONTO_ELETRONICO = "http://localhost:8080/PLPOE-1.0.0.1-SNAPSHOT/rest/pontoEletronicoResource";
	
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
	
	$scope.gerenciadorPontoEletronicoList = [
		{
	        "codigo": 1,
	        "dataHoraAtual": "15/09/2019",
	        "dataHoraPrimeiraEntrada": "09:45",
	        "dataHoraPrimeiraSaida": "11:01",
	        "dataHoraSegundaEntrada": "11:01",
	        "dataHoraSegundaSaida": "11:01",
	        "observacao": ""
	    },
	    {
	        "codigo": 2,
	        "dataHoraAtual": "16/09/2019",
	        "dataHoraPrimeiraEntrada": "08:16",
	        "dataHoraPrimeiraSaida": "08:16",
	        "dataHoraSegundaEntrada": "08:16",
	        "dataHoraSegundaSaida": "08:16",
	        "observacao": ""
	    },
	    {
	        "codigo": 3,
	        "dataHoraAtual": "17/09/2019",
	        "dataHoraPrimeiraEntrada": "07:21",
	        "dataHoraPrimeiraSaida": "07:21",
	        "dataHoraSegundaEntrada": "07:21",
	        "dataHoraSegundaSaida": "07:21",
	        "observacao": ""
	    },
	    {
	        "codigo": 4,
	        "dataHoraAtual": "18/09/2019",
	        "dataHoraPrimeiraEntrada": "08:47",
	        "dataHoraPrimeiraSaida": "08:47",
	        "dataHoraSegundaEntrada": "08:47",
	        "dataHoraSegundaSaida": "08:47",
	        "observacao": ""
	    },
	    {
	        "codigo": 5,
	        "dataHoraAtual": "19/09/2019",
	        "dataHoraPrimeiraEntrada": "07:7",
	        "dataHoraPrimeiraSaida": "11:10",
	        "dataHoraSegundaEntrada": "11:10",
	        "dataHoraSegundaSaida": "11:10",
	        "observacao": ""
	    },
	    {
	        "codigo": 6,
	        "dataHoraAtual": "20/09/2019",
	        "dataHoraPrimeiraEntrada": "09:56",
	        "dataHoraPrimeiraSaida": "09:56",
	        "dataHoraSegundaEntrada": "09:56",
	        "dataHoraSegundaSaida": "09:56",
	        "observacao": ""
	    },
	];
	
	function incializador() {
//		$scope.moduleName = "Registro de Ponto Eletrônico";
		$scope.findAll();
	};
	
	$scope.save = function(gerenciadorPontoEletronicoModel) {
		console.log(gerenciadorPontoEletronicoModel);
		gerenciadorPontoEletronicoModel.dataHoraAtual = $scope.recuperarDataAtualDDMMAAAA();
		$scope.gerenciadorPontoEletronicoList.push(gerenciadorPontoEletronicoModel);
//		$http.post(NAME_API_PONTO_ELETRONICO);
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
		console.log($http.get(NAME_API_PONTO_ELETRONICO));
		// $scope.gerenciadorPontoEletronicoList.push();
	};
	
	$scope.findOne = function(gerenciadorPontoEletronicoModel) {
		
	};
	
	/* 
		Retornar data atual no Formato DD/MM/AAAA
	*/
	$scope.recuperarDataAtualDDMMAAAA = function() {
		return new Date().getDate() + '/' + (new Date().getMonth()+1) + '/' + new Date().getFullYear();
	};
	
	/* 
		Retornar data atual no Formato DD/MM/AAAA HH:MM
	*/
	$scope.recuperarDataAtualDDMMAAAAHHMM = function() {
		return new Date().getDate() + '/' + (new Date().getMonth()+1) + '/' + new Date().getFullYear() + ' ' + new Date().getHours() + ':' + new Date().getMinutes();
	};
	
	/*
	 	Limpar dados do formulario
	*/
	$scope.clear = function() {
		$scope.gerenciadorPontoEletronicoModel = null;
	};
	
});
