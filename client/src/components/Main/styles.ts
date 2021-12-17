import styled from 'styled-components';

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  padding: 10px 30px;

  @media(max-width: 426px){
    &{
      padding: 0;
    }
  }
`;

export const Title = styled.h2`
  font-size: 36pt;
  color: #0E0E10;
  text-align: center;
  font-weight: bold;
  margin: .5em 0;

  @media(max-width: 426px){
    &{
      font-size: 28pt;
      margin: .25em 0;
    }
  }
`;

export const Comandos = styled.div`
  display: grid;
  grid-template-columns: 50% 50%;
  padding: 10px;

  @media(max-width: 426px){
    &{
      grid-template-columns: auto;
      padding: 0;
      margin-bottom: .5em;
    }
  }
`;

export const Comando = styled.div`
  background-color: #F4F4F4;
  padding: 1.5em;
  margin: 1em;

  @media(max-width: 426px){
    &{
      margin: .5em 1em;
    }
  }
`;

export const Nome = styled.h5`
  word-wrap: break-word;
  text-align: center;
  font-size: 22pt;
  margin-bottom: .5em;

  @media(max-width: 426px){
    &{
      font-size: 20pt;
    }
  }
`;

export const Descricao = styled.p`
  font-size: 14pt;
  text-align: justify;
  margin-bottom: .5em;

  span{
    font-weight: bold;
  }

  @media(max-width: 426px){
    &{
      font-size: 13pt;
      text-align: left;
      margin-bottom: .25em;
    }
  }
`;

export const Sinonimos = styled.h6`
  font-size: 14pt;
  margin-bottom: .5em;
  font-weight: normal;

  span{
    font-weight: bold;
  }

  @media(max-width: 426px){
    &{
      font-size: 13pt;
      margin-bottom: .25em;
    }
  }
`;

export const Exemplo = styled.h6`
  font-size: 14pt;
  color: #FF1800;

  span{
    color: black;
  }

  @media(max-width: 426px){
    &{
      font-size: 13pt;
      margin-bottom: .25em;
    }
  }
`;
