import styled from 'styled-components';

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  padding: 10px 30px;
  height: 78vh;
`;

export const Title = styled.h2`
  font-size: 36pt;
  color: #0E0E10;
  text-align: center;
  font-weight: bold;
  margin: .5em 0;
`;

export const Comandos = styled.div`
  display: grid;
  grid-template-columns: auto auto;
  padding: 10px;
`;

export const Comando = styled.div`
  background-color: #F4F4F4;
  padding: 1.5em;
  margin: 1em;
`;

export const Nome = styled.h5`
  text-align: center;
  font-size: 22pt;
  margin-bottom: .5em;
`;

export const Descricao = styled.p`
  font-size: 14pt;
  text-align: justify;
  margin-bottom: .5em;

  span{
    font-weight: bold;
  }
`;

export const Sinonimos = styled.h6`
  font-size: 14pt;
  margin-bottom: .5em;
  font-weight: normal;

  span{
    font-weight: bold;
  }
`;

export const Exemplo = styled.h6`
  font-size: 14pt;
  color: #FF1800;

  span{
    color: black;
  }
`;
