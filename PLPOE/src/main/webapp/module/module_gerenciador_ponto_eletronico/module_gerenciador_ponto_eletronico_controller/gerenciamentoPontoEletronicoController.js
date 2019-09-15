var gerenciadorPontoEletronicoModelModule = angular.module("gerenciadorPontoEletronicoModelModule", []);

gerenciadorPontoEletronicoModelModule.controller("gerenciadorPontoEletronicoModelController", function($scope, $http) {
	
	var NAME_API_PONTO_ELETRONICO = "http://localhost:8080/PLPOE-1.0.0.1-SNAPSHOT/rest/pontoEletronicoResource";
	
	$scope.gerenciadorPontoEletronicoModel = {
		dataHoraPrimeiraEntrada: null,
		dataHoraPrimeiraSaida: null,
		dataHoraSegundaEntrada: null,
		dataHoraSegundaSaida: null,
		dataHoraAtual: null,
	};
	
	$scope.gerenciadorPontoEletronicoList = [];
	
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